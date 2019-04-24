.class public Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;
.super Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;
.source "MultiBackgroundInitializer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$1;,
        Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer",
        "<",
        "Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;",
        ">;"
    }
.end annotation


# instance fields
.field private final childInitializers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 108
    invoke-direct {p0}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;-><init>()V

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->childInitializers:Ljava/util/Map;

    .line 109
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1, "exec"    # Ljava/util/concurrent/ExecutorService;

    .prologue
    .line 119
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->childInitializers:Ljava/util/Map;

    .line 120
    return-void
.end method


# virtual methods
.method public addInitializer(Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 135
    .local p2, "init":Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;, "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;"
    if-nez p1, :cond_0

    .line 136
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name of child initializer must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_0
    if-nez p2, :cond_1

    .line 140
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Child initializer must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_1
    monitor-enter p0

    .line 145
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "addInitializer() must not be called after start()!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 149
    :cond_2
    :try_start_1
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->childInitializers:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    return-void
.end method

.method protected getTaskCount()I
    .locals 4

    .prologue
    .line 165
    const/4 v2, 0x1

    .line 167
    .local v2, "result":I
    iget-object v3, p0, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->childInitializers:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;

    .line 168
    .local v0, "bi":Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;, "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;"
    invoke-virtual {v0}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;->getTaskCount()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 171
    .end local v0    # "bi":Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;, "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;"
    :cond_0
    return v2
.end method

.method protected bridge synthetic initialize()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 97
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->initialize()Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;

    move-result-object v0

    return-object v0
.end method

.method protected initialize()Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 187
    monitor-enter p0

    .line 189
    :try_start_0
    new-instance v6, Ljava/util/HashMap;

    iget-object v8, p0, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->childInitializers:Ljava/util/Map;

    invoke-direct {v6, v8}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 191
    .local v6, "inits":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;>;"
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer;->getActiveExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 195
    .local v4, "exec":Ljava/util/concurrent/ExecutorService;
    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;

    .line 196
    .local v0, "bi":Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;, "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;"
    invoke-virtual {v0}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;->getExternalExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    if-nez v8, :cond_0

    .line 198
    invoke-virtual {v0, v4}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;->setExternalExecutor(Ljava/util/concurrent/ExecutorService;)V

    .line 200
    :cond_0
    invoke-virtual {v0}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;->start()Z

    goto :goto_0

    .line 191
    .end local v0    # "bi":Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;, "Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;"
    .end local v4    # "exec":Ljava/util/concurrent/ExecutorService;
    .end local v5    # "i$":Ljava/util/Iterator;
    .end local v6    # "inits":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;>;"
    :catchall_0
    move-exception v8

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v8

    .line 204
    .restart local v4    # "exec":Ljava/util/concurrent/ExecutorService;
    .restart local v5    # "i$":Ljava/util/Iterator;
    .restart local v6    # "inits":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;>;"
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 205
    .local v7, "results":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 206
    .local v3, "excepts":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/ConcurrentException;>;"
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 208
    .local v2, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;>;"
    :try_start_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;

    invoke-virtual {v8}, Lorg/apache/commons/lang3/concurrent/BackgroundInitializer;->get()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Lorg/apache/commons/lang3/concurrent/ConcurrentException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 209
    :catch_0
    move-exception v1

    .line 210
    .local v1, "cex":Lorg/apache/commons/lang3/concurrent/ConcurrentException;
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 214
    .end local v1    # "cex":Lorg/apache/commons/lang3/concurrent/ConcurrentException;
    .end local v2    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/apache/commons/lang3/concurrent/BackgroundInitializer<*>;>;"
    :cond_2
    new-instance v8, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v7, v3, v9}, Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$MultiBackgroundInitializerResults;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lorg/apache/commons/lang3/concurrent/MultiBackgroundInitializer$1;)V

    return-object v8
.end method
