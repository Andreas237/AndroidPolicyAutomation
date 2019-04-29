.class final Lretrofit/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


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

    return-void
.end method

.method static readBodyToBytesIfNecessary(Lretrofit/client/Request;)Lretrofit/client/Request;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 56
    instance-of v1, v0, Lretrofit/mime/TypedByteArray;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-interface {v0}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v1

    .line 61
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 62
    invoke-interface {v0, v2}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 63
    new-instance v0, Lretrofit/mime/TypedByteArray;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 65
    new-instance v1, Lretrofit/client/Request;

    invoke-virtual {p0}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v2, v3, p0, v0}, Lretrofit/client/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lretrofit/mime/TypedOutput;)V

    return-object v1

    :cond_1
    :goto_0
    return-object p0
.end method

.method static readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-virtual {p0}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 74
    instance-of v1, v0, Lretrofit/mime/TypedByteArray;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {v0}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-interface {v0}, Lretrofit/mime/TypedInput;->in()Ljava/io/InputStream;

    move-result-object v0

    .line 81
    :try_start_0
    invoke-static {v0}, Lretrofit/Utils;->streamToBytes(Ljava/io/InputStream;)[B

    move-result-object v2

    .line 82
    new-instance v3, Lretrofit/mime/TypedByteArray;

    invoke-direct {v3, v1, v2}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 84
    invoke-static {p0, v3}, Lretrofit/Utils;->replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 88
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    return-object p0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 90
    :catch_1
    :cond_2
    throw p0

    :cond_3
    :goto_0
    return-object p0
.end method

.method static replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;
    .locals 7

    .line 96
    new-instance v6, Lretrofit/client/Response;

    invoke-virtual {p0}, Lretrofit/client/Response;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lretrofit/client/Response;->getStatus()I

    move-result v2

    invoke-virtual {p0}, Lretrofit/client/Response;->getReason()Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-virtual {p0}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object v4

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object v6
.end method

.method static streamToBytes(Ljava/io/InputStream;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 39
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    if-eqz p0, :cond_0

    const/16 v1, 0x1000

    .line 41
    new-array v1, v1, [B

    .line 43
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    .line 44
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method static validateServiceClass(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 101
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only interface endpoint definitions are supported."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 107
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p0

    array-length p0, p0

    if-lez p0, :cond_1

    .line 108
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Interface definitions must not extend other interfaces."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method
