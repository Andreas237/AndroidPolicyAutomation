.class public Lcom/sina/weibo/sdk/network/base/WbResponseBody;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private inputStream:Ljava/io/InputStream;

.field private length:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->inputStream:Ljava/io/InputStream;

    .line 19
    iput-wide p2, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->length:J

    .line 20
    return-void
.end method


# virtual methods
.method public byteStream()Ljava/io/InputStream;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->inputStream:Ljava/io/InputStream;

    return-object v0
.end method

.method public contentLength()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->length:J

    return-wide v0
.end method

.method public string()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/RequestException;
        }
    .end annotation

    .line 24
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 25
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 27
    :goto_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->inputStream:Ljava/io/InputStream;

    invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 28
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->inputStream:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 31
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 32
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 36
    goto :goto_1

    .line 33
    :catch_0
    move-exception v3

    .line 34
    new-instance v4, Lcom/sina/weibo/sdk/network/exception/RequestException;

    invoke-virtual {v3}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    .line 35
    throw v4

    .line 37
    :goto_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method
