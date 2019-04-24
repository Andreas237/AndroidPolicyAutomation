.class public Lcom/microblink/camera/geometry/Rectangle;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/camera/geometry/Rectangle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mHeight:F

.field private mWidth:F

.field private mX:F

.field private mY:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/camera/geometry/Rectangle$1;

    invoke-direct {v0}, Lcom/microblink/camera/geometry/Rectangle$1;-><init>()V

    sput-object v0, Lcom/microblink/camera/geometry/Rectangle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    iput p2, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    iput p3, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    iput p4, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/microblink/camera/geometry/Rectangle$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/camera/geometry/Rectangle;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static getDefaultROI()Lcom/microblink/camera/geometry/Rectangle;
    .locals 3

    new-instance v0, Lcom/microblink/camera/geometry/Rectangle;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, v1}, Lcom/microblink/camera/geometry/Rectangle;-><init>(FFFF)V

    return-object v0
.end method

.method private isPerc(F)Z
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getHeight()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    return v0
.end method

.method public getWidth()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    return v0
.end method

.method public getX()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    return v0
.end method

.method public getY()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    return v0
.end method

.method public isRelative()Z
    .locals 3

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    invoke-direct {p0, v0}, Lcom/microblink/camera/geometry/Rectangle;->isPerc(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    invoke-direct {p0, v0}, Lcom/microblink/camera/geometry/Rectangle;->isPerc(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    invoke-direct {p0, v0}, Lcom/microblink/camera/geometry/Rectangle;->isPerc(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    invoke-direct {p0, v0}, Lcom/microblink/camera/geometry/Rectangle;->isPerc(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    iget v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    add-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    iget v2, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    add-float/2addr v0, v2

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public log()V
    .locals 4

    const-string v0, "Rectangle[{}, {}, {}, {}]"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public normalizeToUnitRectangle()V
    .locals 2

    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iput v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    :cond_0
    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iput v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    :cond_1
    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iput v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    :cond_2
    iget v0, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    iput v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Rectangle["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/microblink/camera/geometry/Rectangle;->mX:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/microblink/camera/geometry/Rectangle;->mY:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/microblink/camera/geometry/Rectangle;->mWidth:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/microblink/camera/geometry/Rectangle;->mHeight:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
