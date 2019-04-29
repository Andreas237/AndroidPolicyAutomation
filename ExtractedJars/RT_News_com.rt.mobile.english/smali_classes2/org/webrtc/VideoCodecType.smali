.class final enum Lorg/webrtc/VideoCodecType;
.super Ljava/lang/Enum;
.source "VideoCodecType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/VideoCodecType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/VideoCodecType;

.field public static final enum H264:Lorg/webrtc/VideoCodecType;

.field public static final enum VP8:Lorg/webrtc/VideoCodecType;

.field public static final enum VP9:Lorg/webrtc/VideoCodecType;


# instance fields
.field private final mimeType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 15
    new-instance v0, Lorg/webrtc/VideoCodecType;

    const-string v1, "VP8"

    const-string v2, "video/x-vnd.on2.vp8"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lorg/webrtc/VideoCodecType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/webrtc/VideoCodecType;->VP8:Lorg/webrtc/VideoCodecType;

    .line 16
    new-instance v0, Lorg/webrtc/VideoCodecType;

    const-string v1, "VP9"

    const-string v2, "video/x-vnd.on2.vp9"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lorg/webrtc/VideoCodecType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/webrtc/VideoCodecType;->VP9:Lorg/webrtc/VideoCodecType;

    .line 17
    new-instance v0, Lorg/webrtc/VideoCodecType;

    const-string v1, "H264"

    const-string v2, "video/avc"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lorg/webrtc/VideoCodecType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/webrtc/VideoCodecType;->H264:Lorg/webrtc/VideoCodecType;

    const/4 v0, 0x3

    .line 14
    new-array v0, v0, [Lorg/webrtc/VideoCodecType;

    sget-object v1, Lorg/webrtc/VideoCodecType;->VP8:Lorg/webrtc/VideoCodecType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/webrtc/VideoCodecType;->VP9:Lorg/webrtc/VideoCodecType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/webrtc/VideoCodecType;->H264:Lorg/webrtc/VideoCodecType;

    aput-object v1, v0, v5

    sput-object v0, Lorg/webrtc/VideoCodecType;->$VALUES:[Lorg/webrtc/VideoCodecType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput-object p3, p0, Lorg/webrtc/VideoCodecType;->mimeType:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/VideoCodecType;
    .locals 1

    .line 14
    const-class v0, Lorg/webrtc/VideoCodecType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/VideoCodecType;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/VideoCodecType;
    .locals 1

    .line 14
    sget-object v0, Lorg/webrtc/VideoCodecType;->$VALUES:[Lorg/webrtc/VideoCodecType;

    invoke-virtual {v0}, [Lorg/webrtc/VideoCodecType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/VideoCodecType;

    return-object v0
.end method


# virtual methods
.method mimeType()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lorg/webrtc/VideoCodecType;->mimeType:Ljava/lang/String;

    return-object v0
.end method
