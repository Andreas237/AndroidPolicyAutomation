.class public Lcom/microblink/camera/hardware/camera/ImageSize;
.super Ljava/lang/Object;


# instance fields
.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mWidth:I

    iput p2, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mHeight:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/microblink/camera/hardware/camera/ImageSize;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/microblink/camera/hardware/camera/ImageSize;

    iget v0, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mWidth:I

    iget v2, p1, Lcom/microblink/camera/hardware/camera/ImageSize;->mWidth:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mHeight:I

    iget p1, p1, Lcom/microblink/camera/hardware/camera/ImageSize;->mHeight:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mHeight:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mWidth:I

    mul-int/lit16 v0, v0, 0x7fc9

    iget v1, p0, Lcom/microblink/camera/hardware/camera/ImageSize;->mHeight:I

    add-int/2addr v0, v1

    return v0
.end method
