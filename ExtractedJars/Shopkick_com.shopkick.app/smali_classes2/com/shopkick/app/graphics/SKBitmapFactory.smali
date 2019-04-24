.class public Lcom/shopkick/app/graphics/SKBitmapFactory;
.super Ljava/lang/Object;
.source "SKBitmapFactory.java"


# instance fields
.field private largeImageThreshold:I

.field private limitLargeImages:Z


# direct methods
.method public constructor <init>(ZI)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-boolean p1, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->limitLargeImages:Z

    .line 12
    iput p2, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->largeImageThreshold:I

    return-void
.end method

.method private getBitmapFactoryOptions(I)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 26
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 27
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 28
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 30
    iget-boolean v1, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->limitLargeImages:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->largeImageThreshold:I

    if-le p1, v1, :cond_0

    const/4 p1, 0x2

    .line 33
    iput p1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    :cond_0
    return-object v0
.end method


# virtual methods
.method public decodeByteArray([B)Landroid/graphics/Bitmap;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 19
    :cond_0
    array-length v0, p1

    invoke-direct {p0, v0}, Lcom/shopkick/app/graphics/SKBitmapFactory;->getBitmapFactoryOptions(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    const/4 v1, 0x0

    .line 20
    array-length v2, p1

    invoke-static {p1, v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public setLargeImageThreshold(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->largeImageThreshold:I

    return-void
.end method

.method public setLimitLargeImages(Z)V
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/shopkick/app/graphics/SKBitmapFactory;->limitLargeImages:Z

    return-void
.end method
