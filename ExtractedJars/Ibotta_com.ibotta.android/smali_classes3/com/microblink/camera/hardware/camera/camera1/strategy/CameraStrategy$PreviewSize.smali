.class public Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PreviewSize"
.end annotation


# instance fields
.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    iput p1, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->mHeight:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Width and mHeight must be larger than zero!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->mHeight:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;->mWidth:I

    return v0
.end method
