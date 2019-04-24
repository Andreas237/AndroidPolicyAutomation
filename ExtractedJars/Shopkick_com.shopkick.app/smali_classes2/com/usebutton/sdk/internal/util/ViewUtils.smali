.class public Lcom/usebutton/sdk/internal/util/ViewUtils;
.super Ljava/lang/Object;
.source "ViewUtils.java"


# static fields
.field private static final BYTES_PER_PIXEL:I = 0x4

.field private static final TAG:Ljava/lang/String; = "ViewUtils"

.field private static sShowAnimTime:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 3

    const/4 v0, 0x1

    if-lt p2, v0, :cond_3

    if-ge p1, v0, :cond_0

    goto :goto_1

    .line 58
    :cond_0
    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 59
    iget p0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-gt v1, p2, :cond_1

    if-le p0, p1, :cond_2

    .line 64
    :cond_1
    div-int/lit8 v1, v1, 0x2

    .line 65
    div-int/lit8 p0, p0, 0x2

    .line 69
    :goto_0
    div-int v2, v1, v0

    if-lt v2, p2, :cond_2

    div-int v2, p0, v0

    if-lt v2, p1, :cond_2

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static colorDrawable(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 155
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-object p0
.end method

.method public static darken(IF)I
    .locals 2
    .param p1    # F
        .annotation build Landroid/support/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    const/4 v0, 0x3

    .line 143
    new-array v0, v0, [F

    .line 144
    invoke-static {p0, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p0, 0x2

    .line 145
    aget v1, v0, p0

    mul-float/2addr v1, p1

    aput v1, v0, p0

    .line 146
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p0

    return p0
.end method

.method public static decodeImageWithin([BII)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 21
    array-length v1, p0

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 27
    :cond_0
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x1

    .line 28
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 29
    array-length v3, p0

    const/4 v4, 0x0

    invoke-static {p0, v4, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 30
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    mul-int/2addr v3, v5

    const/4 v5, 0x4

    mul-int/2addr v3, v5

    .line 32
    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 33
    invoke-static {v1, p1, p2}, Lcom/usebutton/sdk/internal/util/ViewUtils;->calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v7

    iput v7, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 34
    array-length v7, p0

    invoke-static {p0, v4, v7, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v6, "ViewUtils"

    const-string v7, "Decoded bitmap for frame %dx%d, original %dx%d %.1fkB decoded %dx%d %.1fkB"

    const/16 v8, 0x8

    .line 35
    new-array v8, v8, [Ljava/lang/Object;

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v8, v2

    const/4 p1, 0x2

    iget p2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, p1

    const/4 p1, 0x3

    iget p2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, p1

    int-to-double p1, v3

    const-wide/high16 v1, 0x4090000000000000L    # 1024.0

    div-double/2addr p1, v1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    aput-object p1, v8, v5

    const/4 p1, 0x5

    .line 37
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, p1

    const/4 p1, 0x6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v8, p1

    const/4 p1, 0x7

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->getByteSize(Landroid/graphics/Bitmap;)I

    move-result p2

    int-to-double v3, p2

    div-double/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    aput-object p2, v8, p1

    .line 35
    invoke-static {v6, v7, v8}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "ViewUtils"

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Out of memory while decoding image of size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p0

    div-int/lit16 p0, p0, 0x400

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "kB."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_1

    .line 40
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p0

    if-nez p0, :cond_1

    .line 41
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object v0
.end method

.method private static getAnimationTime(Landroid/view/View;)I
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 108
    sget-object v0, Lcom/usebutton/sdk/internal/util/ViewUtils;->sShowAnimTime:Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 109
    invoke-static {}, Lcom/usebutton/sdk/internal/util/TestUtils;->isTesting()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 110
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sput-object p0, Lcom/usebutton/sdk/internal/util/ViewUtils;->sShowAnimTime:Ljava/lang/Integer;

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x10e0001

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sput-object p0, Lcom/usebutton/sdk/internal/util/ViewUtils;->sShowAnimTime:Ljava/lang/Integer;

    .line 115
    :cond_1
    :goto_0
    sget-object p0, Lcom/usebutton/sdk/internal/util/ViewUtils;->sShowAnimTime:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private static getByteSize(Landroid/graphics/Bitmap;)I
    .locals 0

    .line 48
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p0

    return p0
.end method

.method public static hide(Landroid/view/View;)V
    .locals 4

    if-eqz p0, :cond_3

    .line 119
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 124
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F

    move-result v1

    .line 128
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const-string v0, "alpha"

    const/4 v2, 0x2

    .line 131
    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x1

    const/4 v3, 0x0

    aput v3, v2, v1

    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 132
    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->getAnimationTime(Landroid/view/View;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    const/16 v0, 0x8

    .line 134
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public static varargs isNotNull([Ljava/lang/Object;)Z
    .locals 4

    .line 79
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static show(Landroid/view/View;)V
    .locals 5

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 89
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 90
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-eq v1, v2, :cond_1

    return-void

    .line 94
    :cond_1
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    .line 95
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 99
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    const-string v3, "alpha"

    const/4 v4, 0x2

    .line 102
    new-array v4, v4, [F

    aput v1, v4, v0

    const/4 v0, 0x1

    aput v2, v4, v0

    invoke-static {p0, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 103
    invoke-static {p0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->getAnimationTime(Landroid/view/View;)I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 104
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method
