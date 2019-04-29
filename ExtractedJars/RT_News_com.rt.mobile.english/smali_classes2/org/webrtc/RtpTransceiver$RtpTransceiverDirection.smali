.class public final enum Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
.super Ljava/lang/Enum;
.source "RtpTransceiver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/RtpTransceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RtpTransceiverDirection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

.field public static final enum INACTIVE:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

.field public static final enum RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

.field public static final enum SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

.field public static final enum SEND_RECV:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;


# instance fields
.field private final nativeIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 37
    new-instance v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const-string v1, "SEND_RECV"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_RECV:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    .line 38
    new-instance v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const-string v1, "SEND_ONLY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    .line 39
    new-instance v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const-string v1, "RECV_ONLY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    .line 40
    new-instance v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const-string v1, "INACTIVE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v5}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->INACTIVE:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    const/4 v0, 0x4

    .line 36
    new-array v0, v0, [Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    sget-object v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_RECV:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    aput-object v1, v0, v3

    sget-object v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->RECV_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    aput-object v1, v0, v4

    sget-object v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->INACTIVE:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    aput-object v1, v0, v5

    sput-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->$VALUES:[Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    iput p3, p0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->nativeIndex:I

    return-void
.end method

.method static fromNativeIndex(I)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 5
    .annotation build Lorg/webrtc/CalledByNative;
        value = "RtpTransceiverDirection"
    .end annotation

    .line 55
    invoke-static {}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->values()[Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 56
    invoke-virtual {v3}, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->getNativeIndex()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uknown native RtpTransceiverDirection type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 1

    .line 36
    const-class v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 1

    .line 36
    sget-object v0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->$VALUES:[Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-virtual {v0}, [Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    return-object v0
.end method


# virtual methods
.method getNativeIndex()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "RtpTransceiverDirection"
    .end annotation

    .line 50
    iget v0, p0, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->nativeIndex:I

    return v0
.end method
