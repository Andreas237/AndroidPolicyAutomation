.class public Lcom/mopub/common/DownloadResponse;
.super Ljava/lang/Object;
.source "DownloadResponse.java"


# instance fields
.field private mBytes:[B

.field private final mContentLength:J

.field private final mHeaders:[Lorg/apache/http/Header;

.field private final mStatusCode:I


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/mopub/common/DownloadResponse;->mBytes:[B

    .line 20
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    .line 23
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 25
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    :try_start_1
    invoke-static {v3, v0}, Lcom/mopub/common/util/Streams;->copyContent(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 27
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iput-object v1, p0, Lcom/mopub/common/DownloadResponse;->mBytes:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v1, v3

    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 31
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 34
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    iput v0, p0, Lcom/mopub/common/DownloadResponse;->mStatusCode:I

    .line 35
    iget-object v0, p0, Lcom/mopub/common/DownloadResponse;->mBytes:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/mopub/common/DownloadResponse;->mContentLength:J

    .line 36
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/DownloadResponse;->mHeaders:[Lorg/apache/http/Header;

    return-void

    :catchall_1
    move-exception p1

    .line 30
    :goto_1
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 31
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    throw p1
.end method


# virtual methods
.method public getByteArray()[B
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/mopub/common/DownloadResponse;->mBytes:[B

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/mopub/common/DownloadResponse;->mContentLength:J

    return-wide v0
.end method

.method public getFirstHeader(Lcom/mopub/common/util/ResponseHeader;)Ljava/lang/String;
    .locals 6

    .line 52
    iget-object v0, p0, Lcom/mopub/common/DownloadResponse;->mHeaders:[Lorg/apache/http/Header;

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 53
    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mopub/common/util/ResponseHeader;->getKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 54
    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getStatusCode()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/mopub/common/DownloadResponse;->mStatusCode:I

    return v0
.end method
