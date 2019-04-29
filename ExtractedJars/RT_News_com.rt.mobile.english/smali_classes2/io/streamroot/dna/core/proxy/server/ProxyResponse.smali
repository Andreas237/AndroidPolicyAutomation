.class public final Lio/streamroot/dna/core/proxy/server/ProxyResponse;
.super Ljava/lang/Object;
.source "ProxyResponse.kt"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProxyResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProxyResponse.kt\nio/streamroot/dna/core/proxy/server/ProxyResponse\n+ 2 Chunk.kt\nio/streamroot/dna/core/utils/ChunkKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,170:1\n12#2,2:171\n14#2,6:174\n20#2:181\n10667#3:173\n10668#3:180\n*E\n*S KotlinDebug\n*F\n+ 1 ProxyResponse.kt\nio/streamroot/dna/core/proxy/server/ProxyResponse\n*L\n146#1,2:171\n146#1,6:174\n146#1:181\n146#1:173\n146#1:180\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 62\u00020\u0001:\u00016B+\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005J\u0008\u0010*\u001a\u00020\'H\u0016J\u000e\u0010+\u001a\u00020\'2\u0006\u0010*\u001a\u00020\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020\'2\u0006\u0010.\u001a\u00020/H\u0002J\u000e\u00101\u001a\u00020\'2\u0006\u00102\u001a\u00020\u0018J\u001e\u00103\u001a\u00020\'*\u0002042\u0006\u00105\u001a\u00020\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00a8\u00067"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "Ljava/io/Closeable;",
        "code",
        "",
        "mimeType",
        "",
        "data",
        "Ljava/io/InputStream;",
        "totalBytes",
        "",
        "(ILjava/lang/String;Ljava/io/InputStream;J)V",
        "binaryData",
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        "(ILjava/lang/String;Lio/streamroot/dna/core/binary/store/BinaryData;)V",
        "getBinaryData",
        "()Lio/streamroot/dna/core/binary/store/BinaryData;",
        "getCode",
        "()I",
        "contentLength",
        "getData",
        "()Ljava/io/InputStream;",
        "header",
        "Ljava/util/HashMap;",
        "isCloseConnection",
        "",
        "()Z",
        "keepAlive",
        "lowerCaseHeader",
        "getMimeType",
        "()Ljava/lang/String;",
        "setMimeType",
        "(Ljava/lang/String;)V",
        "requestMethod",
        "Lio/streamroot/dna/core/proxy/server/Method;",
        "getRequestMethod",
        "()Lio/streamroot/dna/core/proxy/server/Method;",
        "setRequestMethod",
        "(Lio/streamroot/dna/core/proxy/server/Method;)V",
        "addHeader",
        "",
        "name",
        "value",
        "close",
        "closeConnection",
        "getHeader",
        "send",
        "outputStream",
        "Ljava/io/OutputStream;",
        "sendBody",
        "setKeepAlive",
        "useKeepAlive",
        "printHeader",
        "Ljava/io/PrintWriter;",
        "key",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;


# instance fields
.field private final binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final code:I

.field private contentLength:J

.field private final data:Ljava/io/InputStream;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final header:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private keepAlive:Z

.field private final lowerCaseHeader:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mimeType:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private requestMethod:Lio/streamroot/dna/core/proxy/server/Method;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lio/streamroot/dna/core/binary/store/BinaryData;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/binary/store/BinaryData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binaryData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->lowerCaseHeader:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 74
    check-cast v0, Ljava/io/InputStream;

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    .line 75
    iput p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->code:I

    .line 76
    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    .line 77
    iput-object p3, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 78
    invoke-virtual {p3}, Lio/streamroot/dna/core/binary/store/BinaryData;->getSize()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->contentLength:J

    const/4 p1, 0x1

    .line 79
    iput-boolean p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->keepAlive:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/io/InputStream;J)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->lowerCaseHeader:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 60
    check-cast v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    iput-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    .line 61
    iput p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->code:I

    .line 62
    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    if-nez p3, :cond_0

    .line 64
    new-instance p1, Ljava/io/ByteArrayInputStream;

    const/4 p2, 0x0

    new-array p2, p2, [B

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    check-cast p1, Ljava/io/InputStream;

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    const-wide/16 p1, 0x0

    .line 65
    iput-wide p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->contentLength:J

    goto :goto_0

    .line 67
    :cond_0
    iput-object p3, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    .line 68
    iput-wide p4, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->contentLength:J

    :goto_0
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->keepAlive:Z

    return-void
.end method

.method public static final newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->Companion:Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;->newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    move-result-object p0

    return-object p0
.end method

.method private final printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/io/PrintWriter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    .line 140
    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    const-string p2, ": "

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p1, p3}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object p1

    const-string p2, "\r\n"

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    :cond_0
    return-void
.end method

.method private final sendBody(Ljava/io/OutputStream;)V
    .locals 7

    .line 145
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 171
    invoke-static {v0}, Lio/streamroot/dna/core/utils/ChunkKt;->chunkCapacity([Ljava/nio/ByteBuffer;)I

    move-result v2

    new-array v2, v2, [B

    .line 173
    array-length v3, v0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v0, v4

    if-eqz v5, :cond_0

    .line 174
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 175
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 176
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    invoke-virtual {v5, v2, v1, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 177
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->limit()I

    move-result v5

    .line 146
    invoke-virtual {p1, v2, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 148
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    :cond_2
    return-void
.end method


# virtual methods
.method public final addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->lowerCaseHeader:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "(this as java.lang.String).toLowerCase()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public close()V
    .locals 1

    .line 135
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method

.method public final closeConnection(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 98
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    check-cast p1, Ljava/util/Map;

    const-string v0, "connection"

    const-string v1, "close"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 100
    :cond_0
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    const-string v0, "connection"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final getBinaryData()Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 37
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->binaryData:Lio/streamroot/dna/core/binary/store/BinaryData;

    return-object v0
.end method

.method public final getCode()I
    .locals 1

    .line 25
    iget v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->code:I

    return v0
.end method

.method public final getData()Ljava/io/InputStream;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->data:Ljava/io/InputStream;

    return-object v0
.end method

.method public final getHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->lowerCaseHeader:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "(this as java.lang.String).toLowerCase()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 30
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestMethod()Lio/streamroot/dna/core/proxy/server/Method;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 45
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->requestMethod:Lio/streamroot/dna/core/proxy/server/Method;

    return-object v0
.end method

.method public final isCloseConnection()Z
    .locals 2

    const-string v0, "close"

    const-string v1, "connection"

    .line 54
    invoke-virtual {p0, v1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final send(Ljava/io/OutputStream;)V
    .locals 6
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "E, d MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "GMT"

    .line 116
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 118
    new-instance v1, Ljava/io/PrintWriter;

    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    new-instance v4, Lio/streamroot/dna/core/proxy/server/ContentType;

    iget-object v5, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    invoke-direct {v4, v5}, Lio/streamroot/dna/core/proxy/server/ContentType;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lio/streamroot/dna/core/proxy/server/ContentType;->getEncoding()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    check-cast v3, Ljava/io/Writer;

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    check-cast v2, Ljava/io/Writer;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    const-string v2, "HTTP/1.1 "

    .line 119
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v2

    iget v3, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->code:I

    invoke-static {v3}, Lio/streamroot/dna/core/proxy/server/ResponseCodeKt;->codeDescription(I)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v2

    const-string v3, " \r\n"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    const-string v2, "Date"

    .line 120
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v2, v0}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    .line 121
    iget-boolean v2, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->keepAlive:Z

    if-eqz v2, :cond_0

    const-string v2, "keep-alive"

    goto :goto_0

    :cond_0
    const-string v2, "close"

    :goto_0
    invoke-direct {p0, v1, v0, v2}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    .line 122
    iget-object v2, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    invoke-direct {p0, v1, v0, v2}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Length"

    .line 123
    iget-wide v2, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->contentLength:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v0, v2}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->header:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 125
    invoke-direct {p0, v1, v3, v2}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->printHeader(Ljava/io/PrintWriter;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v0, "\r\n"

    .line 127
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    .line 128
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 130
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->sendBody(Ljava/io/OutputStream;)V

    .line 131
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final setKeepAlive(Z)V
    .locals 0

    .line 108
    iput-boolean p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->keepAlive:Z

    return-void
.end method

.method public final setMimeType(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 30
    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->mimeType:Ljava/lang/String;

    return-void
.end method

.method public final setRequestMethod(Lio/streamroot/dna/core/proxy/server/Method;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/proxy/server/Method;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 45
    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/ProxyResponse;->requestMethod:Lio/streamroot/dna/core/proxy/server/Method;

    return-void
.end method
