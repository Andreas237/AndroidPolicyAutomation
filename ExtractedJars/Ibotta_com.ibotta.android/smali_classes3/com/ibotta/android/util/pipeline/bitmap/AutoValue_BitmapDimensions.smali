.class final Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;
.super Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;
.source "AutoValue_BitmapDimensions.java"


# instance fields
.field private final height:I

.field private final width:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;-><init>()V

    .line 14
    iput p1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->width:I

    .line 15
    iput p2, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->height:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 41
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 42
    check-cast p1, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;

    .line 43
    iget v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->width:I

    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getWidth()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->height:I

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;->getHeight()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getHeight()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 53
    iget v0, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->width:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 55
    iget v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->height:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BitmapDimensions{width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
