.class public final Lcom/microblink/internal/BitmapUtils;
.super Ljava/lang/Object;


# static fields
.field public static final DEFAULT_RESOLUTION:I = 0x2d0

.field private static final MAX_HIGH_RESOLUTION_WIDTH:I = 0x438

.field private static final MIN_HIGH_RESOLUTION_WIDTH:I = 0x2d0

.field private static final TAG:Ljava/lang/String; = "BitmapUtils"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 1

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static isHighResFrame(I)Z
    .locals 1

    const/16 v0, 0x2d0

    if-ge v0, p0, :cond_0

    const/16 v0, 0x438

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static orientate(Landroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;I)Landroid/graphics/Bitmap;
    .locals 8
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/microblink/CameraOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p2, p2

    sget-object v0, Lcom/microblink/internal/BitmapUtils$1;->$SwitchMap$com$microblink$CameraOrientation:[I

    invoke-virtual {p1}, Lcom/microblink/CameraOrientation;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/high16 p1, 0x43340000    # 180.0f

    goto :goto_0

    :pswitch_1
    const/high16 p1, 0x42b40000    # 90.0f

    goto :goto_0

    :pswitch_2
    const/high16 p1, 0x43870000    # 270.0f

    :goto_0
    add-float/2addr p2, p1

    :goto_1
    invoke-virtual {v6, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    const-string p2, "BitmapUtils"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
