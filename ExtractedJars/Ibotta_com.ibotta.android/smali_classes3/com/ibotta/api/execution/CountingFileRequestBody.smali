.class public Lcom/ibotta/api/execution/CountingFileRequestBody;
.super Lokhttp3/RequestBody;
.source "CountingFileRequestBody.java"


# static fields
.field private static final SEGMENT_SIZE:I = 0x800


# instance fields
.field private final contentType:Ljava/lang/String;

.field private final file:Ljava/io/File;

.field private final listener:Lcom/ibotta/api/execution/ApiUploadProgressListener;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Lcom/ibotta/api/execution/ApiUploadProgressListener;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->file:Ljava/io/File;

    .line 26
    iput-object p2, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->contentType:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->listener:Lcom/ibotta/api/execution/ApiUploadProgressListener;

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->contentType:Ljava/lang/String;

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->file:Ljava/io/File;

    invoke-static {v1}, Lokio/Okio;->source(Ljava/io/File;)Lokio/Source;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 48
    :goto_0
    invoke-interface {p1}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    move-result-object v3

    const-wide/16 v4, 0x800

    invoke-interface {v0, v3, v4, v5}, Lokio/Source;->read(Lokio/Buffer;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    add-long/2addr v1, v3

    .line 50
    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    .line 51
    iget-object v3, p0, Lcom/ibotta/api/execution/CountingFileRequestBody;->listener:Lcom/ibotta/api/execution/ApiUploadProgressListener;

    invoke-virtual {p0}, Lcom/ibotta/api/execution/CountingFileRequestBody;->contentLength()J

    move-result-wide v4

    invoke-interface {v3, v1, v2, v4, v5}, Lcom/ibotta/api/execution/ApiUploadProgressListener;->onBytesTransferred(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 56
    throw p1
.end method
