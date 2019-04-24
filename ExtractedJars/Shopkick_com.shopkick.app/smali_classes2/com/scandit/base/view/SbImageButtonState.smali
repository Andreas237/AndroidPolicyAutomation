.class public Lcom/scandit/base/view/SbImageButtonState;
.super Ljava/lang/Object;
.source "SbImageButtonState.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private mBitmap:Landroid/graphics/Bitmap;

.field private mBitmapReference:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private mExpectedHash:I

.field private mResourceId:I

.field private mVerifyHash:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    .line 25
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mExpectedHash:I

    .line 26
    iput-boolean v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    .line 28
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    .line 31
    iput p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    .line 25
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mExpectedHash:I

    .line 26
    iput-boolean v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    .line 28
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    .line 43
    iput p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    .line 44
    iput p2, p0, Lcom/scandit/base/view/SbImageButtonState;->mExpectedHash:I

    .line 45
    iput-boolean v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    .line 25
    iput v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mExpectedHash:I

    .line 26
    iput-boolean v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    .line 28
    iput-object v1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    .line 48
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method private calculateHash([I)I
    .locals 5

    .line 113
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget v3, p1, v1

    const v4, -0x61c8864f

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method private getBitmapFromReference(Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    iget-object p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1

    :cond_0
    if-gtz p2, :cond_2

    .line 79
    iget-boolean p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 80
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Invalid logo image"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 84
    :cond_2
    iget-boolean v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mVerifyHash:Z

    if-eqz v0, :cond_3

    .line 86
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x0

    .line 87
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap$Config;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 91
    invoke-direct {p0, v0}, Lcom/scandit/base/view/SbImageButtonState;->verifyLogoChecksum(Landroid/graphics/Bitmap;)V

    .line 94
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 95
    new-instance p2, Ljava/lang/ref/SoftReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    return-object p1
.end method

.method private verifyLogoChecksum(Landroid/graphics/Bitmap;)V
    .locals 9

    .line 100
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 101
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    .line 102
    new-array v8, v6, [I

    .line 103
    div-int/lit8 v5, v0, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    move-object v0, p1

    move-object v1, v8

    move v3, v6

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 104
    invoke-direct {p0, v8}, Lcom/scandit/base/view/SbImageButtonState;->calculateHash([I)I

    move-result p1

    .line 105
    iget v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mExpectedHash:I

    if-ne p1, v0, :cond_0

    return-void

    .line 106
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Invalid logo image"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    return-object v0

    .line 65
    :cond_0
    iget v0, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    invoke-direct {p0, p1, v0}, Lcom/scandit/base/view/SbImageButtonState;->getBitmapFromReference(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmap:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mBitmapReference:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method public setResourceId(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/scandit/base/view/SbImageButtonState;->mResourceId:I

    return-void
.end method
