.class public final Lokhttp3/Cache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Cache$CacheResponseBody;,
        Lokhttp3/Cache$Entry;,
        Lokhttp3/Cache$CacheRequestImpl;
    }
.end annotation


# static fields
.field private static final ENTRY_BODY:I = 0x1

.field private static final ENTRY_COUNT:I = 0x2

.field private static final ENTRY_METADATA:I = 0x0

.field private static final VERSION:I = 0x31191


# instance fields
.field private final cache:Lokhttp3/internal/DiskLruCache;

.field private hitCount:I

.field final internalCache:Lokhttp3/internal/InternalCache;

.field private networkCount:I

.field private requestCount:I

.field private writeAbortCount:I

.field private writeSuccessCount:I


# direct methods
.method public constructor <init>(Ljava/io/File;J)V
    .locals 1

    .line 177
    sget-object v0, Lokhttp3/internal/io/FileSystem;->SYSTEM:Lokhttp3/internal/io/FileSystem;

    invoke-direct {p0, p1, p2, p3, v0}, Lokhttp3/Cache;-><init>(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V

    .line 178
    return-void
.end method

.method constructor <init>(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V
    .locals 6

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    new-instance v0, Lokhttp3/Cache$1;

    invoke-direct {v0, p0}, Lokhttp3/Cache$1;-><init>(Lokhttp3/Cache;)V

    iput-object v0, p0, Lokhttp3/Cache;->internalCache:Lokhttp3/internal/InternalCache;

    .line 181
    move-object v0, p4

    move-object v1, p1

    move-wide v4, p2

    const v2, 0x31191

    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lokhttp3/internal/DiskLruCache;->create(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJ)Lokhttp3/internal/DiskLruCache;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    .line 182
    return-void
.end method

.method private abortQuietly(Lokhttp3/internal/DiskLruCache$Editor;)V
    .locals 1

    .line 278
    if-eqz p1, :cond_0

    .line 279
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/internal/DiskLruCache$Editor;->abort()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 282
    :cond_0
    goto :goto_0

    .line 281
    :catch_0
    move-exception v0

    .line 283
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lokhttp3/Cache;Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 135
    invoke-direct {p0, p1}, Lokhttp3/Cache;->put(Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lokhttp3/Cache;Lokhttp3/Request;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 135
    invoke-direct {p0, p1}, Lokhttp3/Cache;->remove(Lokhttp3/Request;)V

    return-void
.end method

.method static synthetic access$1000(Lokio/BufferedSource;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 135
    invoke-static {p0}, Lokhttp3/Cache;->readInt(Lokio/BufferedSource;)I

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lokhttp3/Cache;Lokhttp3/Response;Lokhttp3/Response;)V
    .locals 0

    .line 135
    invoke-direct {p0, p1, p2}, Lokhttp3/Cache;->update(Lokhttp3/Response;Lokhttp3/Response;)V

    return-void
.end method

.method static synthetic access$300(Lokhttp3/Cache;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Lokhttp3/Cache;->trackConditionalCacheHit()V

    return-void
.end method

.method static synthetic access$400(Lokhttp3/Cache;Lokhttp3/internal/http/CacheStrategy;)V
    .locals 0

    .line 135
    invoke-direct {p0, p1}, Lokhttp3/Cache;->trackResponse(Lokhttp3/internal/http/CacheStrategy;)V

    return-void
.end method

.method static synthetic access$600(Lokhttp3/Cache;)Lokhttp3/internal/DiskLruCache;
    .locals 1

    .line 135
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    return-object v0
.end method

.method static synthetic access$808(Lokhttp3/Cache;)I
    .locals 2

    .line 135
    iget v0, p0, Lokhttp3/Cache;->writeSuccessCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lokhttp3/Cache;->writeSuccessCount:I

    return v0
.end method

.method static synthetic access$908(Lokhttp3/Cache;)I
    .locals 2

    .line 135
    iget v0, p0, Lokhttp3/Cache;->writeAbortCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lokhttp3/Cache;->writeAbortCount:I

    return v0
.end method

.method private put(Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 220
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    .line 222
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/HttpMethod;->invalidatesCache(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    :try_start_0
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/Cache;->remove(Lokhttp3/Request;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    goto :goto_0

    .line 225
    :catch_0
    move-exception v3

    .line 228
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 230
    :cond_0
    const-string v0, "GET"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 234
    const/4 v0, 0x0

    return-object v0

    .line 237
    :cond_1
    invoke-static {p1}, Lokhttp3/internal/http/OkHeaders;->hasVaryAll(Lokhttp3/Response;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_2
    new-instance v3, Lokhttp3/Cache$Entry;

    invoke-direct {v3, p1}, Lokhttp3/Cache$Entry;-><init>(Lokhttp3/Response;)V

    .line 242
    const/4 v4, 0x0

    .line 244
    :try_start_1
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v1

    invoke-static {v1}, Lokhttp3/Cache;->urlToKey(Lokhttp3/Request;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/DiskLruCache;->edit(Ljava/lang/String;)Lokhttp3/internal/DiskLruCache$Editor;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 245
    if-nez v4, :cond_3

    .line 246
    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_3
    :try_start_2
    invoke-virtual {v3, v4}, Lokhttp3/Cache$Entry;->writeTo(Lokhttp3/internal/DiskLruCache$Editor;)V

    .line 249
    new-instance v0, Lokhttp3/Cache$CacheRequestImpl;

    invoke-direct {v0, p0, v4}, Lokhttp3/Cache$CacheRequestImpl;-><init>(Lokhttp3/Cache;Lokhttp3/internal/DiskLruCache$Editor;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    .line 250
    :catch_1
    move-exception v5

    .line 251
    invoke-direct {p0, v4}, Lokhttp3/Cache;->abortQuietly(Lokhttp3/internal/DiskLruCache$Editor;)V

    .line 252
    const/4 v0, 0x0

    return-object v0
.end method

.method private static readInt(Lokio/BufferedSource;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 694
    :try_start_0
    invoke-interface {p0}, Lokio/BufferedSource;->readDecimalLong()J

    move-result-wide v3

    .line 695
    invoke-interface {p0}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v5

    .line 696
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v3, v0

    if-gtz v0, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 697
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected an int but was \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 699
    :cond_1
    long-to-int v0, v3

    return v0

    .line 700
    :catch_0
    move-exception v3

    .line 701
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private remove(Lokhttp3/Request;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 257
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-static {p1}, Lokhttp3/Cache;->urlToKey(Lokhttp3/Request;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/DiskLruCache;->remove(Ljava/lang/String;)Z

    .line 258
    return-void
.end method

.method private declared-synchronized trackConditionalCacheHit()V
    .locals 3

    monitor-enter p0

    .line 413
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->hitCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/Cache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized trackResponse(Lokhttp3/internal/http/CacheStrategy;)V
    .locals 2

    monitor-enter p0

    .line 401
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->requestCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/Cache;->requestCount:I

    .line 403
    iget-object v0, p1, Lokhttp3/internal/http/CacheStrategy;->networkRequest:Lokhttp3/Request;

    if-eqz v0, :cond_0

    .line 405
    iget v0, p0, Lokhttp3/Cache;->networkCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/Cache;->networkCount:I

    goto :goto_0

    .line 406
    :cond_0
    iget-object v0, p1, Lokhttp3/internal/http/CacheStrategy;->cacheResponse:Lokhttp3/Response;

    if-eqz v0, :cond_1

    .line 408
    iget v0, p0, Lokhttp3/Cache;->hitCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/Cache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private update(Lokhttp3/Response;Lokhttp3/Response;)V
    .locals 5

    .line 261
    new-instance v1, Lokhttp3/Cache$Entry;

    invoke-direct {v1, p2}, Lokhttp3/Cache$Entry;-><init>(Lokhttp3/Response;)V

    .line 262
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    check-cast v0, Lokhttp3/Cache$CacheResponseBody;

    invoke-static {v0}, Lokhttp3/Cache$CacheResponseBody;->access$500(Lokhttp3/Cache$CacheResponseBody;)Lokhttp3/internal/DiskLruCache$Snapshot;

    move-result-object v2

    .line 263
    const/4 v3, 0x0

    .line 265
    :try_start_0
    invoke-virtual {v2}, Lokhttp3/internal/DiskLruCache$Snapshot;->edit()Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    move-object v3, v0

    .line 266
    if-eqz v3, :cond_0

    .line 267
    invoke-virtual {v1, v3}, Lokhttp3/Cache$Entry;->writeTo(Lokhttp3/internal/DiskLruCache$Editor;)V

    .line 268
    invoke-virtual {v3}, Lokhttp3/internal/DiskLruCache$Editor;->commit()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    :cond_0
    goto :goto_0

    .line 270
    :catch_0
    move-exception v4

    .line 271
    invoke-direct {p0, v3}, Lokhttp3/Cache;->abortQuietly(Lokhttp3/internal/DiskLruCache$Editor;)V

    .line 273
    :goto_0
    return-void
.end method

.method private static urlToKey(Lokhttp3/Request;)Ljava/lang/String;
    .locals 1

    .line 185
    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->md5Hex(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 389
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->close()V

    .line 390
    return-void
.end method

.method public delete()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 305
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->delete()V

    .line 306
    return-void
.end method

.method public directory()Ljava/io/File;
    .locals 1

    .line 393
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->getDirectory()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public evictAll()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->evictAll()V

    .line 314
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 385
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->flush()V

    .line 386
    return-void
.end method

.method get(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 5

    .line 189
    invoke-static {p1}, Lokhttp3/Cache;->urlToKey(Lokhttp3/Request;)Ljava/lang/String;

    move-result-object v1

    .line 193
    :try_start_0
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0, v1}, Lokhttp3/internal/DiskLruCache;->get(Ljava/lang/String;)Lokhttp3/internal/DiskLruCache$Snapshot;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 194
    if-nez v2, :cond_0

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 200
    :cond_0
    goto :goto_0

    .line 197
    :catch_0
    move-exception v4

    .line 199
    const/4 v0, 0x0

    return-object v0

    .line 203
    :goto_0
    :try_start_1
    new-instance v3, Lokhttp3/Cache$Entry;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lokhttp3/internal/DiskLruCache$Snapshot;->getSource(I)Lokio/Source;

    move-result-object v0

    invoke-direct {v3, v0}, Lokhttp3/Cache$Entry;-><init>(Lokio/Source;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    goto :goto_1

    .line 204
    :catch_1
    move-exception v4

    .line 205
    invoke-static {v2}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 206
    const/4 v0, 0x0

    return-object v0

    .line 209
    :goto_1
    invoke-virtual {v3, v2}, Lokhttp3/Cache$Entry;->response(Lokhttp3/internal/DiskLruCache$Snapshot;)Lokhttp3/Response;

    move-result-object v4

    .line 211
    invoke-virtual {v3, p1, v4}, Lokhttp3/Cache$Entry;->matches(Lokhttp3/Request;Lokhttp3/Response;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 212
    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 213
    const/4 v0, 0x0

    return-object v0

    .line 216
    :cond_1
    return-object v4
.end method

.method public declared-synchronized hitCount()I
    .locals 2

    monitor-enter p0

    .line 421
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->hitCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public initialize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 297
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->initialize()V

    .line 298
    return-void
.end method

.method public isClosed()Z
    .locals 1

    .line 397
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->isClosed()Z

    move-result v0

    return v0
.end method

.method public maxSize()J
    .locals 2

    .line 381
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->getMaxSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public declared-synchronized networkCount()I
    .locals 2

    monitor-enter p0

    .line 417
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->networkCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized requestCount()I
    .locals 2

    monitor-enter p0

    .line 425
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->requestCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public size()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 377
    iget-object v0, p0, Lokhttp3/Cache;->cache:Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public urls()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 326
    new-instance v0, Lokhttp3/Cache$2;

    invoke-direct {v0, p0}, Lokhttp3/Cache$2;-><init>(Lokhttp3/Cache;)V

    return-object v0
.end method

.method public declared-synchronized writeAbortCount()I
    .locals 2

    monitor-enter p0

    .line 369
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->writeAbortCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized writeSuccessCount()I
    .locals 2

    monitor-enter p0

    .line 373
    :try_start_0
    iget v0, p0, Lokhttp3/Cache;->writeSuccessCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
