.class public Lorg/webrtc/VideoEncoder$BitrateAllocation;
.super Ljava/lang/Object;
.source "VideoEncoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BitrateAllocation"
.end annotation


# instance fields
.field public final bitratesBbs:[[I


# direct methods
.method public constructor <init>([[I)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
        value = "BitrateAllocation"
    .end annotation

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lorg/webrtc/VideoEncoder$BitrateAllocation;->bitratesBbs:[[I

    return-void
.end method


# virtual methods
.method public getSum()I
    .locals 9

    .line 87
    iget-object v0, p0, Lorg/webrtc/VideoEncoder$BitrateAllocation;->bitratesBbs:[[I

    const/4 v1, 0x0

    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v0, v3

    .line 88
    array-length v6, v5

    move v7, v4

    move v4, v1

    :goto_1
    if-ge v4, v6, :cond_0

    aget v8, v5, v4

    add-int/2addr v7, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_0

    :cond_1
    return v4
.end method
