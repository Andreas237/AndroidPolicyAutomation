.class public Lorg/webrtc/VideoDecoder$Settings;
.super Ljava/lang/Object;
.source "VideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Settings"
.end annotation


# instance fields
.field public final height:I

.field public final numberOfCores:I

.field public final width:I


# direct methods
.method public constructor <init>(III)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Settings"
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lorg/webrtc/VideoDecoder$Settings;->numberOfCores:I

    .line 27
    iput p2, p0, Lorg/webrtc/VideoDecoder$Settings;->width:I

    .line 28
    iput p3, p0, Lorg/webrtc/VideoDecoder$Settings;->height:I

    return-void
.end method
