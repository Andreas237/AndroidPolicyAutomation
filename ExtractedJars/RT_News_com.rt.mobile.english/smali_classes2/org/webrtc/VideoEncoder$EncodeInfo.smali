.class public Lorg/webrtc/VideoEncoder$EncodeInfo;
.super Ljava/lang/Object;
.source "VideoEncoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EncodeInfo"
.end annotation


# instance fields
.field public final frameTypes:[Lorg/webrtc/EncodedImage$FrameType;


# direct methods
.method public constructor <init>([Lorg/webrtc/EncodedImage$FrameType;)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
        value = "EncodeInfo"
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lorg/webrtc/VideoEncoder$EncodeInfo;->frameTypes:[Lorg/webrtc/EncodedImage$FrameType;

    return-void
.end method
