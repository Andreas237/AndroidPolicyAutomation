.class Lretrofit/client/ApacheClient$TypedOutputEntity;
.super Lorg/apache/http/entity/AbstractHttpEntity;
.source "ApacheClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/client/ApacheClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TypedOutputEntity"
.end annotation


# instance fields
.field final typedOutput:Lretrofit/mime/TypedOutput;


# direct methods
.method constructor <init>(Lretrofit/mime/TypedOutput;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Lorg/apache/http/entity/AbstractHttpEntity;-><init>()V

    .line 152
    iput-object p1, p0, Lretrofit/client/ApacheClient$TypedOutputEntity;->typedOutput:Lretrofit/mime/TypedOutput;

    .line 153
    invoke-interface {p1}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lretrofit/client/ApacheClient$TypedOutputEntity;->setContentType(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getContent()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 165
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 166
    iget-object v1, p0, Lretrofit/client/ApacheClient$TypedOutputEntity;->typedOutput:Lretrofit/mime/TypedOutput;

    invoke-interface {v1, v0}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 167
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v1
.end method

.method public getContentLength()J
    .locals 2

    .line 161
    iget-object v0, p0, Lretrofit/client/ApacheClient$TypedOutputEntity;->typedOutput:Lretrofit/mime/TypedOutput;

    invoke-interface {v0}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public isRepeatable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isStreaming()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lretrofit/client/ApacheClient$TypedOutputEntity;->typedOutput:Lretrofit/mime/TypedOutput;

    invoke-interface {v0, p1}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    return-void
.end method
