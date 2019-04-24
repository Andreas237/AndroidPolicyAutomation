.class public final Lretrofit/mime/MultipartTypedOutput;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/mime/TypedOutput;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/mime/MultipartTypedOutput$MimePart;
    }
.end annotation


# static fields
.field public static final DEFAULT_TRANSFER_ENCODING:Ljava/lang/String; = "binary"


# instance fields
.field private final boundary:Ljava/lang/String;

.field private final footer:[B

.field private length:J

.field private final mimeParts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lretrofit/mime/MultipartTypedOutput$MimePart;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 81
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/mime/MultipartTypedOutput;-><init>(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    .line 85
    iput-object p1, p0, Lretrofit/mime/MultipartTypedOutput;->boundary:Ljava/lang/String;

    .line 86
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lretrofit/mime/MultipartTypedOutput;->buildBoundary(Ljava/lang/String;ZZ)[B

    move-result-object v0

    iput-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->footer:[B

    .line 87
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->footer:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    .line 88
    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;ZZ)[B
    .locals 1

    .line 27
    invoke-static {p0, p1, p2}, Lretrofit/mime/MultipartTypedOutput;->buildBoundary(Ljava/lang/String;ZZ)[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)[B
    .locals 1

    .line 27
    invoke-static {p0, p1, p2}, Lretrofit/mime/MultipartTypedOutput;->buildHeader(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)[B

    move-result-object v0

    return-object v0
.end method

.method private static buildBoundary(Ljava/lang/String;ZZ)[B
    .locals 3

    .line 152
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 154
    if-nez p1, :cond_0

    .line 155
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    :cond_0
    const-string v0, "--"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    if-eqz p2, :cond_1

    .line 160
    const-string v0, "--"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    :cond_1
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 164
    :catch_0
    move-exception v2

    .line 165
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to write multipart boundary"

    invoke-direct {v0, v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static buildHeader(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)[B
    .locals 6

    .line 172
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 174
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    invoke-interface {p2}, Lretrofit/mime/TypedOutput;->fileName()Ljava/lang/String;

    move-result-object v3

    .line 178
    if-eqz v3, :cond_0

    .line 179
    const-string v0, "\"; filename=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    :cond_0
    const-string v0, "\"\r\nContent-Type: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    invoke-interface {p2}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    invoke-interface {p2}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v4

    .line 187
    const-wide/16 v0, -0x1

    cmp-long v0, v4, v0

    if-eqz v0, :cond_1

    .line 188
    const-string v0, "\r\nContent-Length: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 191
    :cond_1
    const-string v0, "\r\nContent-Transfer-Encoding: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    const-string v0, "\r\n\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 196
    :catch_0
    move-exception v2

    .line 197
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to write multipart header"

    invoke-direct {v0, v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V
    .locals 9

    .line 105
    if-nez p1, :cond_0

    .line 106
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Part name must not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_0
    if-nez p2, :cond_1

    .line 109
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Transfer encoding must not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_1
    if-nez p3, :cond_2

    .line 112
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Part body must not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_2
    new-instance v0, Lretrofit/mime/MultipartTypedOutput$MimePart;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    iget-object v4, p0, Lretrofit/mime/MultipartTypedOutput;->boundary:Ljava/lang/String;

    iget-object v5, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    invoke-direct/range {v0 .. v5}, Lretrofit/mime/MultipartTypedOutput$MimePart;-><init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;Ljava/lang/String;Z)V

    move-object v6, v0

    .line 116
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-virtual {v6}, Lretrofit/mime/MultipartTypedOutput$MimePart;->size()J

    move-result-wide v7

    .line 119
    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-nez v0, :cond_3

    .line 120
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    goto :goto_0

    .line 121
    :cond_3
    iget-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    .line 122
    iget-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    add-long/2addr v0, v7

    iput-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    .line 124
    :cond_4
    :goto_0
    return-void
.end method

.method public addPart(Ljava/lang/String;Lretrofit/mime/TypedOutput;)V
    .locals 1

    .line 101
    const-string v0, "binary"

    invoke-virtual {p0, p1, v0, p2}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    .line 102
    return-void
.end method

.method public fileName()Ljava/lang/String;
    .locals 1

    .line 131
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPartCount()I
    .locals 1

    .line 127
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method getParts()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lretrofit/mime/MultipartTypedOutput$MimePart;

    .line 93
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 94
    invoke-virtual {v3, v4}, Lretrofit/mime/MultipartTypedOutput$MimePart;->writeTo(Ljava/io/OutputStream;)V

    .line 95
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    return-object v1
.end method

.method public length()J
    .locals 2

    .line 139
    iget-wide v0, p0, Lretrofit/mime/MultipartTypedOutput;->length:J

    return-wide v0
.end method

.method public mimeType()Ljava/lang/String;
    .locals 2

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "multipart/form-data; boundary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lretrofit/mime/MultipartTypedOutput;->boundary:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->mimeParts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lretrofit/mime/MultipartTypedOutput$MimePart;

    .line 144
    invoke-virtual {v2, p1}, Lretrofit/mime/MultipartTypedOutput$MimePart;->writeTo(Ljava/io/OutputStream;)V

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lretrofit/mime/MultipartTypedOutput;->footer:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 147
    return-void
.end method
