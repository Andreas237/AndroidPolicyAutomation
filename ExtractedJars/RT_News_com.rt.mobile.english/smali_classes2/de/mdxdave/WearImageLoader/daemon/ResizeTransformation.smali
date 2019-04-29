.class public Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;
.super Ljava/lang/Object;
.source "ResizeTransformation.java"

# interfaces
.implements Lcom/squareup/picasso/Transformation;


# instance fields
.field private targetWidth:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;->targetWidth:I

    return-void
.end method


# virtual methods
.method public key()Ljava/lang/String;
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResizeTransformation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;->targetWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transform(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    .line 17
    iget v2, p0, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;->targetWidth:I

    int-to-double v2, v2

    mul-double/2addr v2, v0

    double-to-int v0, v2

    .line 18
    iget v1, p0, Lde/mdxdave/WearImageLoader/daemon/ResizeTransformation;->targetWidth:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 21
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-object v0
.end method
