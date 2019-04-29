.class abstract enum Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
.super Ljava/lang/Enum;
.source "HardwareVideoEncoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/HardwareVideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "YuvFormat"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/HardwareVideoEncoder$YuvFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 591
    new-instance v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$1;

    const-string v1, "I420"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    .line 600
    new-instance v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$2;

    const-string v1, "NV12"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    const/4 v0, 0x2

    .line 590
    new-array v0, v0, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    sget-object v1, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    aput-object v1, v0, v3

    sput-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 590
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILorg/webrtc/HardwareVideoEncoder$1;)V
    .locals 0

    .line 590
    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static valueOf(I)Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 3

    const/16 v0, 0x13

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-eq p0, v0, :cond_0

    const v0, 0x7fa30c00

    if-eq p0, v0, :cond_0

    const v0, 0x7fa30c04

    if-eq p0, v0, :cond_0

    .line 621
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported colorFormat: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 619
    :cond_0
    sget-object p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0

    .line 615
    :cond_1
    sget-object p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    .line 590
    const-class v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    .line 590
    sget-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-virtual {v0}, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object v0
.end method


# virtual methods
.method abstract fillBuffer(Ljava/nio/ByteBuffer;Lorg/webrtc/VideoFrame$Buffer;)V
.end method
