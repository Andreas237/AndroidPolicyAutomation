.class public Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;
.super Lcom/newrelic/agent/android/stores/SharedPrefsStore;
.source "SharedPrefsCrashStore.java"

# interfaces
.implements Lcom/newrelic/agent/android/crash/CrashStore;


# static fields
.field private static final STORE_FILE:Ljava/lang/String; = "NRCrashStore"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "NRCrashStore"

    .line 17
    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public delete(Lcom/newrelic/agent/android/crash/Crash;)V
    .locals 0

    .line 52
    invoke-virtual {p1}, Lcom/newrelic/agent/android/crash/Crash;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->delete(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic delete(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/newrelic/agent/android/crash/Crash;

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;->delete(Lcom/newrelic/agent/android/crash/Crash;)V

    return-void
.end method

.method public fetchAll()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/crash/Crash;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-super {p0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->fetchAll()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 37
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 39
    :try_start_0
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/crash/Crash;->crashFromJsonString(Ljava/lang/String;)Lcom/newrelic/agent/android/crash/Crash;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 41
    sget-object v3, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v4, "Exception encountered while deserializing crash"

    invoke-interface {v3, v4, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public store(Lcom/newrelic/agent/android/crash/Crash;)Z
    .locals 3

    .line 26
    monitor-enter p0

    .line 27
    :try_start_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/crash/Crash;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v0

    const-string v1, "uploadCount"

    .line 28
    invoke-virtual {p1}, Lcom/newrelic/agent/android/crash/Crash;->getUploadCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 29
    invoke-virtual {p1}, Lcom/newrelic/agent/android/crash/Crash;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;->store(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    .line 30
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bridge synthetic store(Ljava/lang/Object;)Z
    .locals 0

    .line 13
    check-cast p1, Lcom/newrelic/agent/android/crash/Crash;

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/stores/SharedPrefsCrashStore;->store(Lcom/newrelic/agent/android/crash/Crash;)Z

    move-result p1

    return p1
.end method
