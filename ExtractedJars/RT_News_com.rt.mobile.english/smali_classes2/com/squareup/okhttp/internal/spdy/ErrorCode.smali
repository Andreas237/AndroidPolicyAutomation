.class public final enum Lcom/squareup/okhttp/internal/spdy/ErrorCode;
.super Ljava/lang/Enum;
.source "ErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/squareup/okhttp/internal/spdy/ErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum COMPRESSION_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum CONNECT_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum ENHANCE_YOUR_CALM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum FLOW_CONTROL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum FRAME_TOO_LARGE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum HTTP_1_1_REQUIRED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum INADEQUATE_SECURITY:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum INTERNAL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum INVALID_CREDENTIALS:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum INVALID_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum NO_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum PROTOCOL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum REFUSED_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum STREAM_ALREADY_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum STREAM_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum STREAM_IN_USE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

.field public static final enum UNSUPPORTED_VERSION:Lcom/squareup/okhttp/internal/spdy/ErrorCode;


# instance fields
.field public final httpCode:I

.field public final spdyGoAwayCode:I

.field public final spdyRstCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 21
    new-instance v6, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->NO_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 23
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "PROTOCOL_ERROR"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->PROTOCOL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 26
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "INVALID_STREAM"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INVALID_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 29
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "UNSUPPORTED_VERSION"

    const/4 v9, 0x3

    const/4 v11, 0x4

    const/4 v12, -0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->UNSUPPORTED_VERSION:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 32
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "STREAM_IN_USE"

    const/4 v3, 0x4

    const/16 v5, 0x8

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_IN_USE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 35
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "STREAM_ALREADY_CLOSED"

    const/4 v9, 0x5

    const/16 v11, 0x9

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_ALREADY_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 37
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "INTERNAL_ERROR"

    const/4 v3, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x6

    const/4 v6, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INTERNAL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 39
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "FLOW_CONTROL_ERROR"

    const/4 v9, 0x7

    const/4 v10, 0x3

    const/4 v11, 0x7

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->FLOW_CONTROL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 41
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "STREAM_CLOSED"

    const/16 v3, 0x8

    const/4 v4, 0x5

    const/4 v5, -0x1

    const/4 v6, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 43
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "FRAME_TOO_LARGE"

    const/16 v9, 0x9

    const/4 v10, 0x6

    const/16 v11, 0xb

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->FRAME_TOO_LARGE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 45
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "REFUSED_STREAM"

    const/16 v3, 0xa

    const/4 v4, 0x7

    const/4 v5, 0x3

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->REFUSED_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 47
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "CANCEL"

    const/16 v9, 0xb

    const/16 v10, 0x8

    const/4 v11, 0x5

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 49
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "COMPRESSION_ERROR"

    const/16 v3, 0xc

    const/16 v4, 0x9

    const/4 v5, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->COMPRESSION_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 51
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "CONNECT_ERROR"

    const/16 v9, 0xd

    const/16 v10, 0xa

    const/4 v11, -0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CONNECT_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 53
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "ENHANCE_YOUR_CALM"

    const/16 v3, 0xe

    const/16 v4, 0xb

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->ENHANCE_YOUR_CALM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 55
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "INADEQUATE_SECURITY"

    const/16 v9, 0xf

    const/16 v10, 0xc

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INADEQUATE_SECURITY:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 57
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v2, "HTTP_1_1_REQUIRED"

    const/16 v3, 0x10

    const/16 v4, 0xd

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->HTTP_1_1_REQUIRED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    .line 59
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const-string v8, "INVALID_CREDENTIALS"

    const/16 v9, 0x11

    const/4 v10, -0x1

    const/16 v11, 0xa

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INVALID_CREDENTIALS:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v0, 0x12

    .line 19
    new-array v0, v0, [Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->NO_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->PROTOCOL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INVALID_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->UNSUPPORTED_VERSION:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_IN_USE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_ALREADY_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INTERNAL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->FLOW_CONTROL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->STREAM_CLOSED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->FRAME_TOO_LARGE:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->REFUSED_STREAM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->COMPRESSION_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CONNECT_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->ENHANCE_YOUR_CALM:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INADEQUATE_SECURITY:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->HTTP_1_1_REQUIRED:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->INVALID_CREDENTIALS:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->$VALUES:[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 66
    iput p3, p0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->httpCode:I

    .line 67
    iput p4, p0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyRstCode:I

    .line 68
    iput p5, p0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyGoAwayCode:I

    return-void
.end method

.method public static fromHttp2(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 5

    .line 79
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->values()[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 80
    iget v4, v3, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->httpCode:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromSpdy3Rst(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 5

    .line 72
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->values()[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 73
    iget v4, v3, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyRstCode:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromSpdyGoAway(I)Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 5

    .line 86
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->values()[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 87
    iget v4, v3, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyGoAwayCode:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 1

    .line 19
    const-class v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .locals 1

    .line 19
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->$VALUES:[Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {v0}, [Lcom/squareup/okhttp/internal/spdy/ErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    return-object v0
.end method
