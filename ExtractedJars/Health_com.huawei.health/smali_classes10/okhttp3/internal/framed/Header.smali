.class public final Lokhttp3/internal/framed/Header;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESPONSE_STATUS:Lokio/ByteString;

.field public static final TARGET_AUTHORITY:Lokio/ByteString;

.field public static final TARGET_HOST:Lokio/ByteString;

.field public static final TARGET_METHOD:Lokio/ByteString;

.field public static final TARGET_PATH:Lokio/ByteString;

.field public static final TARGET_SCHEME:Lokio/ByteString;

.field public static final VERSION:Lokio/ByteString;


# instance fields
.field final hpackSize:I

.field public final name:Lokio/ByteString;

.field public final value:Lokio/ByteString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-string v0, ":status"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->RESPONSE_STATUS:Lokio/ByteString;

    .line 24
    const-string v0, ":method"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    .line 25
    const-string v0, ":path"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    .line 26
    const-string v0, ":scheme"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    .line 27
    const-string v0, ":authority"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    .line 28
    const-string v0, ":host"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    .line 29
    const-string v0, ":version"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/framed/Header;->VERSION:Lokio/ByteString;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 39
    invoke-static {p1}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    invoke-static {p2}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Lokio/ByteString;Ljava/lang/String;)V
    .locals 1

    .line 43
    invoke-static {p2}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Lokio/ByteString;Lokio/ByteString;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    .line 48
    iput-object p2, p0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    .line 49
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x20

    invoke-virtual {p2}, Lokio/ByteString;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lokhttp3/internal/framed/Header;->hpackSize:I

    .line 50
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 53
    instance-of v0, p1, Lokhttp3/internal/framed/Header;

    if-eqz v0, :cond_1

    .line 54
    move-object v2, p1

    check-cast v2, Lokhttp3/internal/framed/Header;

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    iget-object v1, v2, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v0, v1}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    iget-object v1, v2, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    .line 56
    invoke-virtual {v0, v1}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 58
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 62
    const/16 v2, 0x11

    .line 63
    iget-object v0, p0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v0}, Lokio/ByteString;->hashCode()I

    move-result v0

    add-int/lit16 v2, v0, 0x20f

    .line 64
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v1}, Lokio/ByteString;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 65
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 69
    const-string v0, "%s: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v2}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v2}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
