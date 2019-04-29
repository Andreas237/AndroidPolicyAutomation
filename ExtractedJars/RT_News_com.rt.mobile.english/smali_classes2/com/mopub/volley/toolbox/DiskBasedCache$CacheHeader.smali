.class Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;
.super Ljava/lang/Object;
.source "DiskBasedCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/volley/toolbox/DiskBasedCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CacheHeader"
.end annotation


# instance fields
.field public etag:Ljava/lang/String;

.field public key:Ljava/lang/String;

.field public responseHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public serverDate:J

.field public size:J

.field public softTtl:J

.field public ttl:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/volley/Cache$Entry;)V
    .locals 2

    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 369
    iput-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;

    .line 370
    iget-object p1, p2, Lcom/mopub/volley/Cache$Entry;->data:[B

    array-length p1, p1

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->size:J

    .line 371
    iget-object p1, p2, Lcom/mopub/volley/Cache$Entry;->etag:Ljava/lang/String;

    iput-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    .line 372
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->serverDate:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J

    .line 373
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->ttl:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J

    .line 374
    iget-wide v0, p2, Lcom/mopub/volley/Cache$Entry;->softTtl:J

    iput-wide v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J

    .line 375
    iget-object p1, p2, Lcom/mopub/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;

    iput-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;

    return-void
.end method

.method public static readHeader(Ljava/io/InputStream;)Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 384
    new-instance v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;

    invoke-direct {v0}, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;-><init>()V

    .line 385
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readInt(Ljava/io/InputStream;)I

    move-result v1

    const v2, 0x20140623

    if-eq v1, v2, :cond_0

    .line 388
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0

    .line 390
    :cond_0
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;

    .line 391
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    .line 392
    iget-object v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 393
    iput-object v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    .line 395
    :cond_1
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J

    .line 396
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J

    .line 397
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J

    .line 398
    invoke-static {p0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->readStringStringMap(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object p0

    iput-object p0, v0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public toCacheEntry([B)Lcom/mopub/volley/Cache$Entry;
    .locals 3

    .line 406
    new-instance v0, Lcom/mopub/volley/Cache$Entry;

    invoke-direct {v0}, Lcom/mopub/volley/Cache$Entry;-><init>()V

    .line 407
    iput-object p1, v0, Lcom/mopub/volley/Cache$Entry;->data:[B

    .line 408
    iget-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    iput-object p1, v0, Lcom/mopub/volley/Cache$Entry;->etag:Ljava/lang/String;

    .line 409
    iget-wide v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J

    iput-wide v1, v0, Lcom/mopub/volley/Cache$Entry;->serverDate:J

    .line 410
    iget-wide v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J

    iput-wide v1, v0, Lcom/mopub/volley/Cache$Entry;->ttl:J

    .line 411
    iget-wide v1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J

    iput-wide v1, v0, Lcom/mopub/volley/Cache$Entry;->softTtl:J

    .line 412
    iget-object p1, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;

    iput-object p1, v0, Lcom/mopub/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public writeHeader(Ljava/io/OutputStream;)Z
    .locals 4

    const v0, 0x20140623

    const/4 v1, 0x1

    .line 422
    :try_start_0
    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeInt(Ljava/io/OutputStream;I)V

    .line 423
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 424
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;

    :goto_0
    invoke-static {p1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 425
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V

    .line 426
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V

    .line 427
    iget-wide v2, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J

    invoke-static {p1, v2, v3}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V

    .line 428
    iget-object v0, p0, Lcom/mopub/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/mopub/volley/toolbox/DiskBasedCache;->writeStringStringMap(Ljava/util/Map;Ljava/io/OutputStream;)V

    .line 429
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    const-string v0, "%s"

    .line 432
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/mopub/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method
