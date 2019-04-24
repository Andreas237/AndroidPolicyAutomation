.class public Lcom/shopkick/fetchers/image/SKDiskCache;
.super Ljava/lang/Object;
.source "SKDiskCache.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;,
        Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;,
        Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;,
        Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;
    }
.end annotation


# static fields
.field private static final APP_VERSION:I = 0x1

.field private static final DISK_CACHE_SUBDIR:Ljava/lang/String; = "sk_disk_cache"

.field private static final IO_BUFFER_SIZE:I = 0x400

.field private static final VALUE_COUNT:I = 0x1


# instance fields
.field private context:Landroid/content/Context;

.field private diskCacheSize:J

.field private mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

.field private useSdCardForDiskCache:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;J)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-wide p2, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->diskCacheSize:J

    .line 33
    iput-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/fetchers/image/SKDiskCache;Lcom/jakewharton/disklrucache/DiskLruCache;)Lcom/jakewharton/disklrucache/DiskLruCache;
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/fetchers/image/SKDiskCache;)J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->diskCacheSize:J

    return-wide v0
.end method

.method static synthetic access$200(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;)Z
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->removeBytesFromCacheInternal(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private executeTask(Landroid/os/AsyncTask;)V
    .locals 2

    .line 80
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private executeTask(Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;Ljava/io/File;)V
    .locals 3

    .line 84
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private removeBytesFromCacheInternal(Ljava/lang/String;)Z
    .locals 2

    .line 164
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->translateKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 167
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    if-eqz v1, :cond_0

    .line 168
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v1, p1}, Lcom/jakewharton/disklrucache/DiskLruCache;->remove(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 171
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method private translateKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "[^a-zA-Z0-9_-]"

    const-string v1, "_"

    .line 92
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addBytesToCache(Ljava/lang/String;[B)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 48
    new-instance v0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;-><init>(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;[B)V

    invoke-direct {p0, v0}, Lcom/shopkick/fetchers/image/SKDiskCache;->executeTask(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public addBytesToCacheInternal(Ljava/lang/String;[B)V
    .locals 5

    .line 104
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->translateKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    if-eqz v1, :cond_0

    .line 111
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v1, p1}, Lcom/jakewharton/disklrucache/DiskLruCache;->edit(Ljava/lang/String;)Lcom/jakewharton/disklrucache/DiskLruCache$Editor;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 115
    new-instance v1, Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object v3

    const/16 v4, 0x400

    invoke-direct {v1, v3, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    :try_start_1
    array-length v0, p2

    invoke-virtual {v1, p2, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 117
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 118
    invoke-virtual {p1}, Lcom/jakewharton/disklrucache/DiskLruCache$Editor;->commit()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 126
    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    .line 122
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_1

    .line 126
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_1
    :goto_2
    return-void

    :goto_3
    if-eqz v0, :cond_2

    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    :catch_3
    move-exception p2

    .line 128
    invoke-virtual {p2}, Ljava/io/IOException;->printStackTrace()V

    .line 129
    :cond_2
    :goto_4
    throw p1
.end method

.method public deleteDiskLruCache()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v0}, Lcom/jakewharton/disklrucache/DiskLruCache;->delete()V

    return-void
.end method

.method public getBytesFromCache(Ljava/lang/String;Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 54
    new-instance v0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;-><init>(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;)V

    invoke-direct {p0, v0}, Lcom/shopkick/fetchers/image/SKDiskCache;->executeTask(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public getBytesFromCacheInternal(Ljava/lang/String;)[B
    .locals 4

    .line 136
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->translateKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 140
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    if-eqz v1, :cond_1

    .line 141
    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v1, p1}, Lcom/jakewharton/disklrucache/DiskLruCache;->get(Ljava/lang/String;)Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p1, v1}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->getLength(I)J

    move-result-wide v2

    long-to-int v2, v2

    new-array v2, v2, [B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 144
    :try_start_1
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {p1, v1}, Lcom/jakewharton/disklrucache/DiskLruCache$Snapshot;->getInputStream(I)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 145
    :try_start_2
    invoke-virtual {v3, v2}, Ljava/io/InputStream;->read([B)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v0, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v0, v3

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v0, v3

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v0, :cond_2

    .line 152
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 154
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    move-object v2, v0

    .line 148
    :goto_1
    :try_start_4
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v0, :cond_2

    .line 152
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :cond_2
    :goto_2
    return-object v2

    :goto_3
    if-eqz v0, :cond_3

    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 154
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 155
    :cond_3
    :goto_4
    throw p1
.end method

.method public getDiskLruCacheDirectory()Ljava/io/File;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v0}, Lcom/jakewharton/disklrucache/DiskLruCache;->getDirectory()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public getDiskLruCacheMaxSize()J
    .locals 2

    .line 270
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    invoke-virtual {v0}, Lcom/jakewharton/disklrucache/DiskLruCache;->getMaxSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public open()V
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    .line 38
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->useSdCardForDiskCache:Z

    if-eqz v1, :cond_0

    .line 39
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 41
    :cond_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "sk_disk_cache"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 43
    new-instance v0, Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;

    invoke-direct {v0, p0}, Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;-><init>(Lcom/shopkick/fetchers/image/SKDiskCache;)V

    invoke-direct {p0, v0, v1}, Lcom/shopkick/fetchers/image/SKDiskCache;->executeTask(Lcom/shopkick/fetchers/image/SKDiskCache$InitDiskCacheTask;Ljava/io/File;)V

    return-void
.end method

.method public removeBytesFromCache(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 60
    new-instance v0, Lcom/shopkick/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;-><init>(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/shopkick/fetchers/image/SKDiskCache;->executeTask(Landroid/os/AsyncTask;)V

    :cond_0
    return-void
.end method

.method public setMaxSize(J)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->mDiskLruCache:Lcom/jakewharton/disklrucache/DiskLruCache;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0, p1, p2}, Lcom/jakewharton/disklrucache/DiskLruCache;->setMaxSize(J)V

    goto :goto_0

    .line 71
    :cond_0
    iput-wide p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->diskCacheSize:J

    :goto_0
    return-void
.end method

.method public setUseSdCardForDiskCache(Z)V
    .locals 0

    .line 76
    iput-boolean p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache;->useSdCardForDiskCache:Z

    return-void
.end method

.method public testAddBytesToCache(Ljava/lang/String;[B)V
    .locals 0

    .line 278
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/fetchers/image/SKDiskCache;->addBytesToCacheInternal(Ljava/lang/String;[B)V

    return-void
.end method

.method public testGetBytesFromCache(Ljava/lang/String;)[B
    .locals 0

    .line 282
    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->getBytesFromCacheInternal(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public testRemoveBytesFromCache(Ljava/lang/String;)Z
    .locals 0

    .line 286
    invoke-direct {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache;->removeBytesFromCacheInternal(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
