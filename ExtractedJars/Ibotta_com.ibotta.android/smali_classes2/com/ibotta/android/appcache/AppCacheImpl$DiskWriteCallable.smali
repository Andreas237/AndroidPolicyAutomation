.class Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;
.super Ljava/lang/Object;
.source "AppCacheImpl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/appcache/AppCacheImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DiskWriteCallable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheTime:J

.field private final cacheable:Lcom/ibotta/api/CacheableApiCall;

.field private final cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

.field final synthetic this$0:Lcom/ibotta/android/appcache/AppCacheImpl;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;Lcom/ibotta/api/CacheableApiResponse;J)V
    .locals 0

    .line 1080
    iput-object p1, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1081
    iput-object p2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    .line 1082
    iput-object p3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

    .line 1083
    iput-wide p4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheTime:J

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1075
    invoke-virtual {p0}, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "Async disk write: start"

    const/4 v1, 0x0

    .line 1092
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Batch lock: wait"

    .line 1094
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1095
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$200()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v0, "Batch lock: acquired"

    .line 1096
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    :try_start_0
    const-string v2, "Family lock: wait"

    .line 1098
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-static {v2, v3}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$300(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    .line 1100
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    const-string v3, "Family lock: acquired"

    .line 1101
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 1104
    :try_start_1
    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-virtual {v3, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCacheTime(Lcom/ibotta/api/CacheableApiCall;)J

    move-result-wide v3

    .line 1105
    iget-object v5, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v6, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-virtual {v5, v6}, Lcom/ibotta/android/appcache/AppCacheImpl;->getCachePolicy(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CachePolicy;

    move-result-object v5

    .line 1106
    invoke-interface {v5}, Lcom/ibotta/api/CachePolicy;->isMemcache()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    const-wide/16 v7, -0x1

    cmp-long v5, v3, v7

    if-nez v5, :cond_0

    const-string v5, "Cache time on record expected, but missing. Assuming cache was deleted: %1$s"

    .line 1109
    new-array v7, v0, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    aput-object v8, v7, v1

    invoke-static {v5, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1111
    :cond_0
    iget-wide v7, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheTime:J

    cmp-long v5, v7, v3

    if-gez v5, :cond_1

    const-string v3, "Cache time on record is newer than when the disk write job was queued. Skipping disk write for: %1$s"

    .line 1115
    new-array v4, v0, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1153
    :try_start_2
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1156
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 1158
    :try_start_3
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v2, "Pending disk write count: %1$d"

    .line 1159
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v3}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-static {v2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1163
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$200()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v6

    :catchall_0
    move-exception v0

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_1
    :goto_0
    :try_start_4
    const-string v5, "Writing to disk cache now: %1$s"

    .line 1121
    new-array v7, v0, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    aput-object v8, v7, v1

    invoke-static {v5, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    iget-object v5, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v7, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-virtual {v5, v7}, Lcom/ibotta/android/appcache/AppCacheImpl;->buildCacheName(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v5, :cond_3

    .line 1127
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 1128
    new-instance v9, Ljava/io/File;

    iget-object v10, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v11, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v11}, Lcom/ibotta/api/CacheableApiCall;->getCacheFamily()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$400(Lcom/ibotta/android/appcache/AppCacheImpl;Ljava/lang/String;)Ljava/io/File;

    move-result-object v10

    invoke-direct {v9, v10, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1129
    new-instance v10, Ljava/io/FileOutputStream;

    invoke-direct {v10, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 1130
    iget-object v11, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v11}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$500(Lcom/ibotta/android/appcache/AppCacheImpl;)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v11

    iget-object v12, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cachedResponse:Lcom/ibotta/api/CacheableApiResponse;

    invoke-interface {v11, v10, v12}, Lcom/ibotta/android/json/IbottaJson;->toOutputStream(Ljava/io/OutputStream;Ljava/lang/Object;)V

    .line 1131
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->flush()V

    .line 1132
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    .line 1133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v7

    const-string v7, "Disk write took: %1$dms"

    .line 1135
    new-array v8, v0, [Ljava/lang/Object;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v8, v1

    invoke-static {v7, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    iget-object v7, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    .line 1137
    iget-object v8, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v8}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$600(Lcom/ibotta/android/appcache/AppCacheImpl;)Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    move-result-object v8

    invoke-interface {v8, v7, v10, v11}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToWriteDiskCache(Ljava/lang/String;J)V

    const-string v7, "SAVED - Disk cache: %1$s, path=%2$s"

    const/4 v8, 0x2

    .line 1139
    new-array v8, v8, [Ljava/lang/Object;

    aput-object v5, v8, v1

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v0

    invoke-static {v7, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v7, 0x0

    cmp-long v9, v3, v7

    if-gtz v9, :cond_2

    const-string v3, "Cache time is not set yet, doing so now."

    .line 1142
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-static {v3, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$700(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)V

    .line 1146
    :cond_2
    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-static {v3, v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$800(Lcom/ibotta/android/appcache/AppCacheImpl;Lcom/ibotta/api/CacheableApiCall;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catch_0
    move-exception v3

    :try_start_6
    const-string v4, "Failed to cache data to: %1$s"

    .line 1148
    new-array v7, v0, [Ljava/lang/Object;

    aput-object v5, v7, v1

    invoke-static {v3, v4, v7}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    sget-object v4, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v4, v3}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1153
    :cond_3
    :goto_1
    :try_start_7
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1156
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 1158
    :try_start_8
    iget-object v2, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v2}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v2, "Pending disk write count: %1$d"

    .line 1159
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v3}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-static {v2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1163
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$200()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string v0, "Async disk write: finish"

    .line 1166
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v6

    :catchall_1
    move-exception v0

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :catchall_2
    move-exception v3

    .line 1153
    :try_start_9
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v2

    .line 1156
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 1158
    :try_start_a
    iget-object v3, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v3}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v3, "Pending disk write count: %1$d"

    .line 1159
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->this$0:Lcom/ibotta/android/appcache/AppCacheImpl;

    invoke-static {v4}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$1000(Lcom/ibotta/android/appcache/AppCacheImpl;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v1

    invoke-static {v3, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1163
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$200()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v2

    :catchall_4
    move-exception v0

    .line 1161
    invoke-static {}, Lcom/ibotta/android/appcache/AppCacheImpl;->access$900()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getCacheable()Lcom/ibotta/api/CacheableApiCall;
    .locals 1

    .line 1087
    iget-object v0, p0, Lcom/ibotta/android/appcache/AppCacheImpl$DiskWriteCallable;->cacheable:Lcom/ibotta/api/CacheableApiCall;

    return-object v0
.end method
