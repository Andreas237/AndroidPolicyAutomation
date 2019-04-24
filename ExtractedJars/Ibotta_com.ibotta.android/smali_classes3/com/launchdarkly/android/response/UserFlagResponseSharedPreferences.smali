.class public Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;
.super Lcom/launchdarkly/android/response/BaseUserSharedPreferences;
.source "UserFlagResponseSharedPreferences.java"

# interfaces
.implements Lcom/launchdarkly/android/response/FlagResponseSharedPreferences;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;-><init>()V

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, p2, v0}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public bridge synthetic clear()V
    .locals 0

    .line 20
    invoke-super {p0}, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->clear()V

    return-void
.end method

.method public containsKey(Ljava/lang/String;)Z
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public deleteStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 48
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 49
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method getLength()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getStoredDebugEventsUntilDate(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "debugEventsUntilDate"

    .line 94
    invoke-virtual {p0, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 95
    instance-of v1, p1, Lcom/google/gson/JsonNull;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsLong()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to get stored debug events until date"

    const/4 v2, 0x0

    .line 102
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public getStoredFlagVersion(Ljava/lang/String;)I
    .locals 3

    const-string v0, "flagVersion"

    .line 77
    invoke-virtual {p0, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    const/4 v0, -0x1

    if-eqz p1, :cond_1

    .line 78
    instance-of v1, p1, Lcom/google/gson/JsonNull;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to get stored flag version"

    const/4 v2, 0x0

    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    :goto_0
    return v0
.end method

.method public getStoredTrackEvents(Ljava/lang/String;)Z
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "trackEvents"

    .line 111
    invoke-virtual {p0, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 112
    instance-of v1, p1, Lcom/google/gson/JsonNull;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 117
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsBoolean()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to get stored trackEvents"

    .line 119
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    :goto_0
    return v0
.end method

.method public getStoredVariation(Ljava/lang/String;)I
    .locals 3

    const-string v0, "variation"

    .line 127
    invoke-virtual {p0, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    const/4 v0, -0x1

    if-eqz p1, :cond_1

    .line 128
    instance-of v1, p1, Lcom/google/gson/JsonNull;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to get stored variation"

    const/4 v2, 0x0

    .line 135
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    :goto_0
    return v0
.end method

.method public getStoredVersion(Ljava/lang/String;)I
    .locals 3

    const-string v0, "version"

    .line 61
    invoke-virtual {p0, p1, v0}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    const/4 v0, -0x1

    if-eqz p1, :cond_1

    .line 62
    instance-of v1, p1, Lcom/google/gson/JsonNull;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to get stored version"

    const/4 v2, 0x0

    .line 69
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    :cond_1
    :goto_0
    return v0
.end method

.method public getVersionForEvents(Ljava/lang/String;)I
    .locals 2

    .line 153
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->getStoredFlagVersion(Ljava/lang/String;)I

    move-result v0

    .line 154
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->getStoredVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    return p1
.end method

.method public isVersionValid(Lcom/launchdarkly/android/response/FlagResponse;)Z
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 28
    iget-object v1, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->getStoredVersion(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    .line 30
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getVersion()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    return v0
.end method

.method public saveAll(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/response/FlagResponse;",
            ">;)V"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/launchdarkly/android/response/FlagResponse;

    .line 40
    invoke-interface {v1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lcom/launchdarkly/android/response/FlagResponse;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 42
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public updateStoredFlagResponse(Lcom/launchdarkly/android/response/FlagResponse;)V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 55
    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/launchdarkly/android/response/FlagResponse;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
