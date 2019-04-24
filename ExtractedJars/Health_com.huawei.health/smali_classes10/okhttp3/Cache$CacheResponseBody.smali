.class Lokhttp3/Cache$CacheResponseBody;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CacheResponseBody"
.end annotation


# instance fields
.field private final bodySource:Lokio/BufferedSource;

.field private final contentLength:Ljava/lang/String;

.field private final contentType:Ljava/lang/String;

.field private final snapshot:Lokhttp3/internal/DiskLruCache$Snapshot;


# direct methods
.method public constructor <init>(Lokhttp3/internal/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 712
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 713
    iput-object p1, p0, Lokhttp3/Cache$CacheResponseBody;->snapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 714
    iput-object p2, p0, Lokhttp3/Cache$CacheResponseBody;->contentType:Ljava/lang/String;

    .line 715
    iput-object p3, p0, Lokhttp3/Cache$CacheResponseBody;->contentLength:Ljava/lang/String;

    .line 717
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lokhttp3/internal/DiskLruCache$Snapshot;->getSource(I)Lokio/Source;

    move-result-object v1

    .line 718
    new-instance v0, Lokhttp3/Cache$CacheResponseBody$1;

    invoke-direct {v0, p0, v1, p1}, Lokhttp3/Cache$CacheResponseBody$1;-><init>(Lokhttp3/Cache$CacheResponseBody;Lokio/Source;Lokhttp3/internal/DiskLruCache$Snapshot;)V

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->bodySource:Lokio/BufferedSource;

    .line 724
    return-void
.end method

.method static synthetic access$500(Lokhttp3/Cache$CacheResponseBody;)Lokhttp3/internal/DiskLruCache$Snapshot;
    .locals 1

    .line 705
    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->snapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 3

    .line 732
    :try_start_0
    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->contentLength:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->contentLength:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0

    .line 733
    :catch_0
    move-exception v2

    .line 734
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 727
    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->contentType:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->contentType:Ljava/lang/String;

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 739
    iget-object v0, p0, Lokhttp3/Cache$CacheResponseBody;->bodySource:Lokio/BufferedSource;

    return-object v0
.end method
