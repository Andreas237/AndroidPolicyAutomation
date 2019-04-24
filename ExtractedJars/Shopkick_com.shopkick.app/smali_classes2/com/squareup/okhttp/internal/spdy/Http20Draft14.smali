.class public final Lcom/squareup/okhttp/internal/spdy/Http20Draft14;
.super Ljava/lang/Object;
.source "Http20Draft14.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/Variant;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;,
        Lcom/squareup/okhttp/internal/spdy/Http20Draft14$ContinuationSource;,
        Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Writer;,
        Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;
    }
.end annotation


# static fields
.field private static final CONNECTION_PREFACE:Lokio/ByteString;

.field static final FLAG_ACK:B = 0x1t

.field static final FLAG_COMPRESSED:B = 0x20t

.field static final FLAG_END_HEADERS:B = 0x4t

.field static final FLAG_END_PUSH_PROMISE:B = 0x4t

.field static final FLAG_END_STREAM:B = 0x1t

.field static final FLAG_NONE:B = 0x0t

.field static final FLAG_PADDED:B = 0x8t

.field static final FLAG_PRIORITY:B = 0x20t

.field static final INITIAL_MAX_FRAME_SIZE:I = 0x4000

.field static final TYPE_CONTINUATION:B = 0x9t

.field static final TYPE_DATA:B = 0x0t

.field static final TYPE_GOAWAY:B = 0x7t

.field static final TYPE_HEADERS:B = 0x1t

.field static final TYPE_PING:B = 0x6t

.field static final TYPE_PRIORITY:B = 0x2t

.field static final TYPE_PUSH_PROMISE:B = 0x5t

.field static final TYPE_RST_STREAM:B = 0x3t

.field static final TYPE_SETTINGS:B = 0x4t

.field static final TYPE_WINDOW_UPDATE:B = 0x8t


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    .line 47
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->CONNECTION_PREFACE:Lokio/ByteString;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lokio/ByteString;
    .locals 1

    .line 42
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->CONNECTION_PREFACE:Lokio/ByteString;

    return-object v0
.end method

.method static synthetic access$100(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lokio/BufferedSource;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->readMedium(Lokio/BufferedSource;)I

    move-result p0

    return p0
.end method

.method static synthetic access$300(IBS)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-static {p0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->lengthWithoutPadding(IBS)I

    move-result p0

    return p0
.end method

.method static synthetic access$400(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .locals 0

    .line 42
    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->illegalArgument(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$500(Lokio/BufferedSink;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->writeMedium(Lokio/BufferedSink;I)V

    return-void
.end method

.method private static varargs illegalArgument(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 580
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static varargs ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 584
    new-instance v0, Ljava/io/IOException;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static lengthWithoutPadding(IBS)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    if-gt p2, p0, :cond_1

    sub-int/2addr p0, p2

    int-to-short p0, p0

    return p0

    :cond_1
    const/4 p1, 0x2

    .line 645
    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    aput-object p2, p1, v0

    const/4 p2, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "PROTOCOL_ERROR padding %s > remaining length %s"

    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14;->ioException(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method private static readMedium(Lokio/BufferedSource;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 761
    invoke-interface {p0}, Lokio/BufferedSource;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    invoke-interface {p0}, Lokio/BufferedSource;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-interface {p0}, Lokio/BufferedSource;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method private static writeMedium(Lokio/BufferedSink;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 767
    invoke-interface {p0, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 768
    invoke-interface {p0, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    and-int/lit16 p1, p1, 0xff

    .line 769
    invoke-interface {p0, p1}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    return-void
.end method


# virtual methods
.method public getProtocol()Lcom/squareup/okhttp/Protocol;
    .locals 1

    .line 44
    sget-object v0, Lcom/squareup/okhttp/Protocol;->HTTP_2:Lcom/squareup/okhttp/Protocol;

    return-object v0
.end method

.method public newReader(Lokio/BufferedSource;Z)Lcom/squareup/okhttp/internal/spdy/FrameReader;
    .locals 2

    .line 78
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;

    const/16 v1, 0x1000

    invoke-direct {v0, p1, v1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Reader;-><init>(Lokio/BufferedSource;IZ)V

    return-object v0
.end method

.method public newWriter(Lokio/BufferedSink;Z)Lcom/squareup/okhttp/internal/spdy/FrameWriter;
    .locals 1

    .line 82
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Writer;

    invoke-direct {v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$Writer;-><init>(Lokio/BufferedSink;Z)V

    return-object v0
.end method
