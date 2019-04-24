.class public abstract Lcom/newrelic/agent/android/stores/SharedPrefsStore;
.super Ljava/lang/Object;
.source "SharedPrefsStore.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field protected static final ENCODING:Ljava/nio/charset/Charset;

.field protected static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field protected final sharedPrefs:Landroid/content/SharedPreferences;

.field protected final storeFilename:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "ISO-8859-1"

    .line 22
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->ENCODING:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    .line 29
    iput-object p2, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->storeFilename:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    const/4 v0, 0x1

    .line 179
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-ge v1, v2, :cond_0

    .line 180
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    move v0, p1

    goto :goto_0

    .line 182
    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 185
    sget-object v1, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "SharedPrefsStore.applyOrCommitEditor(SharedPreferences.Editor): "

    invoke-interface {v1, v2, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return v0
.end method

.method public clear()V
    .locals 3

    .line 117
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :try_start_1
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 119
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 120
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z

    .line 121
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 123
    sget-object v1, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "SharedPrefsStore.clear(): "

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public count()I
    .locals 3

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :try_start_1
    iget-object v1, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 106
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 108
    sget-object v1, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "SharedPrefsStore.count(): "

    invoke-interface {v1, v2, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method protected decodeBytesToString([B)Ljava/lang/String;
    .locals 2

    .line 161
    :try_start_0
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->ENCODING:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 163
    sget-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "SharedPrefsStore.decodeBytesToString(byte[]): "

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected decodeStringToBytes(Ljava/lang/String;)[B
    .locals 2

    const/4 v0, 0x0

    .line 151
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 153
    sget-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "SharedPrefsStore.decodeStringToBytes(String): "

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public delete(Ljava/lang/String;)V
    .locals 2

    .line 129
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :try_start_1
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 131
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 132
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z

    .line 133
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 135
    sget-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "SharedPrefsStore.delete(): "

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method protected encodeBytes([B)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x2

    .line 141
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 143
    sget-object v0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "SharedPrefsStore.encodeBytes(byte[]): "

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public fetchAll()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :try_start_1
    iget-object v1, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 93
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 94
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v1

    .line 96
    sget-object v2, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "SharedPrefsStore.fetchAll(): "

    invoke-interface {v2, v3, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public getAll()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 76
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :try_start_1
    iget-object v1, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 78
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v1

    .line 80
    sget-object v2, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "SharedPrefsStore.fetchAll(): "

    invoke-interface {v2, v3, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public getStoreFilename()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->storeFilename:Ljava/lang/String;

    return-object v0
.end method

.method public store(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 62
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 63
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 64
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 66
    sget-object p2, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "SharedPrefsStore.store(String, String): "

    invoke-interface {p2, v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public store(Ljava/lang/String;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 51
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 52
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 54
    sget-object p2, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "SharedPrefsStore.store(String, Set<String>): "

    invoke-interface {p2, v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public store(Ljava/lang/String;[B)Z
    .locals 1

    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 39
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->decodeBytesToString([B)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->applyOrCommitEditor(Landroid/content/SharedPreferences$Editor;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 42
    sget-object p2, Lcom/newrelic/agent/android/stores/SharedPrefsStore;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "SharedPrefsStore.store(String, byte[]): "

    invoke-interface {p2, v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
