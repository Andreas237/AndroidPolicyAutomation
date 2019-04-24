.class public Lcom/shopkick/app/persistence/PersistentMap;
.super Ljava/lang/Object;
.source "PersistentMap.java"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;,
        Lcom/shopkick/app/persistence/PersistentMap$LoadFromDiskCallable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K::",
        "Ljava/io/Serializable;",
        "V::",
        "Ljava/io/Serializable;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field private static final SHUTDOWN_WAIT_SECS:I = 0x3c

.field private static final WRITE_DELAY_MS:I = 0x3e8


# instance fields
.field private executor:Ljava/util/concurrent/ExecutorService;

.field private final filePath:Ljava/lang/String;

.field private final forceSynchronousFileAccess:Z

.field private final handler:Landroid/os/Handler;

.field private internalMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private loadFuture:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/util/HashMap<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field private scheduledSave:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 69
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/persistence/PersistentMap;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap;->filePath:Ljava/lang/String;

    .line 77
    iput-boolean p2, p0, Lcom/shopkick/app/persistence/PersistentMap;->forceSynchronousFileAccess:Z

    .line 78
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap;->handler:Landroid/os/Handler;

    .line 79
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    .line 80
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->startLoad()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/persistence/PersistentMap;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->startSaveToDisk()V

    return-void
.end method

.method static synthetic access$102(Lcom/shopkick/app/persistence/PersistentMap;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/shopkick/app/persistence/PersistentMap;->scheduledSave:Z

    return p1
.end method

.method private getMapOrBlock()Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    return-object v0

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 308
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    if-nez v0, :cond_1

    .line 312
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    .line 313
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->scheduleFlush()V

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    iput-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 319
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 321
    iput-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    goto :goto_2

    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    throw v0

    :cond_2
    :goto_2
    return-object v1
.end method

.method private scheduleFlush()V
    .locals 4

    .line 348
    iget-boolean v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->scheduledSave:Z

    if-eqz v0, :cond_0

    return-void

    .line 353
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->forceSynchronousFileAccess:Z

    if-eqz v0, :cond_1

    .line 354
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->startSaveToDisk()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 358
    iput-boolean v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->scheduledSave:Z

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/persistence/PersistentMap$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/persistence/PersistentMap$1;-><init>(Lcom/shopkick/app/persistence/PersistentMap;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method private startLoad()V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 339
    :cond_0
    new-instance v0, Lcom/shopkick/app/persistence/PersistentMap$LoadFromDiskCallable;

    iget-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->filePath:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/persistence/PersistentMap$LoadFromDiskCallable;-><init>(Lcom/shopkick/app/persistence/PersistentMap;Ljava/lang/String;)V

    .line 340
    iget-boolean v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->forceSynchronousFileAccess:Z

    if-eqz v1, :cond_1

    .line 341
    new-instance v1, Lcom/shopkick/app/util/SyncFuture;

    invoke-direct {v1, v0}, Lcom/shopkick/app/util/SyncFuture;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    goto :goto_0

    .line 343
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private startSaveToDisk()V
    .locals 3

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    if-nez v0, :cond_1

    return-void

    .line 380
    :cond_1
    new-instance v1, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;

    iget-object v2, p0, Lcom/shopkick/app/persistence/PersistentMap;->filePath:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v0}, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;-><init>(Lcom/shopkick/app/persistence/PersistentMap;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 381
    iget-boolean v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->forceSynchronousFileAccess:Z

    if-eqz v0, :cond_2

    .line 382
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 384
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :goto_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 226
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 229
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->scheduleFlush()V

    :cond_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 110
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 118
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 170
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 239
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 243
    :cond_0
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/io/Serializable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 128
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/PersistentMap;->get(Ljava/lang/Object;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 253
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 255
    invoke-virtual {v0}, Ljava/util/HashMap;->hashCode()I

    move-result v0

    return v0

    .line 257
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 88
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public isLoaded()Z
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 142
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 146
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public put(Ljava/io/Serializable;Ljava/io/Serializable;)Ljava/io/Serializable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 185
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    .line 188
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->scheduleFlush()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    check-cast p1, Ljava/io/Serializable;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/persistence/PersistentMap;->put(Ljava/io/Serializable;Ljava/io/Serializable;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 198
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/io/Serializable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    if-eqz p1, :cond_1

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->scheduleFlush()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/PersistentMap;->remove(Ljava/lang/Object;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method

.method public shutdown()V
    .locals 4

    .line 272
    iget-boolean v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->scheduledSave:Z

    if-eqz v0, :cond_0

    .line 274
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->startSaveToDisk()V

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 280
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 285
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Thread pool did not terminate"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 289
    :catch_0
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    return-void

    :goto_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap;->executor:Ljava/util/concurrent/ExecutorService;

    throw v0
.end method

.method public simulateFailedLoad()V
    .locals 1

    const/4 v0, 0x0

    .line 471
    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->internalMap:Ljava/util/HashMap;

    .line 472
    iput-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap;->loadFuture:Ljava/util/concurrent/Future;

    return-void
.end method

.method public size()I
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 102
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 156
    invoke-direct {p0}, Lcom/shopkick/app/persistence/PersistentMap;->getMapOrBlock()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 158
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0

    .line 160
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method
