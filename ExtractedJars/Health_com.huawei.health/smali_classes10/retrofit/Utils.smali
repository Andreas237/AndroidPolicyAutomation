.class final Lretrofit/Utils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/Utils$SynchronousExecutor;
    }
.end annotation


# static fields
.field private static final BUFFER_SIZE:I = 0x1000


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    return-void
.end method

.method static readBodyToBytesIfNecessary(Lretrofit/client/Request;)Lretrofit/client/Request;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v4

    .line 56
    if-eqz v4, :cond_0

    instance-of v0, v4, Lretrofit/mime/TypedByteArray;

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    return-object p0

    .line 60
    :cond_1
    invoke-interface {v4}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v5

    .line 61
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 62
    invoke-interface {v4, v6}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 63
    new-instance v4, Lretrofit/mime/TypedByteArray;

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v4, v5, v0}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 65
    new-instance v0, Lretrofit/client/Request;

    invoke-virtual {p0}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, v4}, Lretrofit/client/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lretrofit/mime/TypedOutput;)V

    return-object v0
.end method

.method static readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-virtual {p0}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v1

    .line 74
    if-eqz v1, :cond_0

    instance-of v0, v1, Lretrofit/mime/TypedByteArray;

    if-eqz v0, :cond_1

    .line 75
    :cond_0
    return-object p0

    .line 78
    :cond_1
    invoke-interface {v1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-interface {v1}, Lretrofit/mime/TypedInput;->in()Ljava/io/InputStream;

    move-result-object v3

    .line 81
    :try_start_0
    invoke-static {v3}, Lretrofit/Utils;->streamToBytes(Ljava/io/InputStream;)[B

    move-result-object v4

    .line 82
    new-instance v1, Lretrofit/mime/TypedByteArray;

    invoke-direct {v1, v2, v4}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 84
    invoke-static {p0, v1}, Lretrofit/Utils;->replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 86
    if-eqz v3, :cond_2

    .line 88
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    goto :goto_0

    .line 89
    :catch_0
    move-exception v6

    .line 90
    :cond_2
    :goto_0
    return-object v5

    .line 86
    :catchall_0
    move-exception v7

    if-eqz v3, :cond_3

    .line 88
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 90
    goto :goto_1

    .line 89
    :catch_1
    move-exception v8

    .line 90
    :cond_3
    :goto_1
    throw v7
.end method

.method static replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;
    .locals 6

    .line 96
    new-instance v0, Lretrofit/client/Response;

    invoke-virtual {p0}, Lretrofit/client/Response;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lretrofit/client/Response;->getStatus()I

    move-result v2

    invoke-virtual {p0}, Lretrofit/client/Response;->getReason()Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-virtual {p0}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object v4

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object v0
.end method

.method static streamToBytes(Ljava/io/InputStream;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 39
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 40
    if-eqz p0, :cond_0

    .line 41
    const/16 v0, 0x1000

    new-array v3, v0, [B

    .line 43
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 44
    const/4 v0, 0x0

    invoke-virtual {v2, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method static validateServiceClass(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)V"
        }
    .end annotation

    .line 101
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only interface endpoint definitions are supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_1

    .line 108
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Interface definitions must not extend other interfaces."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_1
    return-void
.end method
