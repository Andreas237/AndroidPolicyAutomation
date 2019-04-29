.class public final enum Lorg/webrtc/MediaStreamTrack$MediaType;
.super Ljava/lang/Enum;
.source "MediaStreamTrack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/MediaStreamTrack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MediaType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/MediaStreamTrack$MediaType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/MediaStreamTrack$MediaType;

.field public static final enum MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

.field public static final enum MEDIA_TYPE_VIDEO:Lorg/webrtc/MediaStreamTrack$MediaType;


# instance fields
.field private final nativeIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 33
    new-instance v0, Lorg/webrtc/MediaStreamTrack$MediaType;

    const-string v1, "MEDIA_TYPE_AUDIO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/MediaStreamTrack$MediaType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

    .line 34
    new-instance v0, Lorg/webrtc/MediaStreamTrack$MediaType;

    const-string v1, "MEDIA_TYPE_VIDEO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lorg/webrtc/MediaStreamTrack$MediaType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_VIDEO:Lorg/webrtc/MediaStreamTrack$MediaType;

    const/4 v0, 0x2

    .line 32
    new-array v0, v0, [Lorg/webrtc/MediaStreamTrack$MediaType;

    sget-object v1, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_VIDEO:Lorg/webrtc/MediaStreamTrack$MediaType;

    aput-object v1, v0, v3

    sput-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->$VALUES:[Lorg/webrtc/MediaStreamTrack$MediaType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput p3, p0, Lorg/webrtc/MediaStreamTrack$MediaType;->nativeIndex:I

    return-void
.end method

.method static fromNativeIndex(I)Lorg/webrtc/MediaStreamTrack$MediaType;
    .locals 5
    .annotation build Lorg/webrtc/CalledByNative;
        value = "MediaType"
    .end annotation

    .line 49
    invoke-static {}, Lorg/webrtc/MediaStreamTrack$MediaType;->values()[Lorg/webrtc/MediaStreamTrack$MediaType;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 50
    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack$MediaType;->getNative()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown native media type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/MediaStreamTrack$MediaType;
    .locals 1

    .line 32
    const-class v0, Lorg/webrtc/MediaStreamTrack$MediaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/MediaStreamTrack$MediaType;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/MediaStreamTrack$MediaType;
    .locals 1

    .line 32
    sget-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->$VALUES:[Lorg/webrtc/MediaStreamTrack$MediaType;

    invoke-virtual {v0}, [Lorg/webrtc/MediaStreamTrack$MediaType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/MediaStreamTrack$MediaType;

    return-object v0
.end method


# virtual methods
.method getNative()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "MediaType"
    .end annotation

    .line 44
    iget v0, p0, Lorg/webrtc/MediaStreamTrack$MediaType;->nativeIndex:I

    return v0
.end method
