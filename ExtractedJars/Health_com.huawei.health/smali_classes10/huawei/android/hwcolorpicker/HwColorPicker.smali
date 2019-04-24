.class public Lhuawei/android/hwcolorpicker/HwColorPicker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;,
        Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;
    }
.end annotation


# static fields
.field private static final CURVE_LINEAR_COEF:F = 5644.5f

.field private static final CURVE_POWER_COEF:F = -0.54f

.field private static final DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

.field private static final DEFAULT_H:I = 0x19

.field private static final DEFAULT_W:I = 0x19

.field private static final IS_EMUI_LITE:Z = false

.field public static final MASK_CLIENT_TYPE:I = -0x1000000

.field public static final MASK_RESULT_INDEX:I = 0xffff

.field public static final MASK_RESULT_STATE:I = 0xff0000

.field private static final TAG:Ljava/lang/String; = "HwColorPicker"

.field private static sIsLibColorPickerExist:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;-><init>(Lhuawei/android/hwcolorpicker/HwColorPicker$1;)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    .line 24
    const/4 v0, 0x1

    sput-boolean v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->sIsLibColorPickerExist:Z

    .line 28
    const-string v0, "colorpicker"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    goto :goto_0

    .line 29
    :catch_0
    move-exception v2

    .line 30
    const/4 v0, 0x0

    sput-boolean v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->sIsLibColorPickerExist:Z

    .line 31
    const-string v0, "HwColorPicker"

    const-string v1, "libcolorpicker.so couldn\'t be found."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$400()Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 1

    .line 14
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0
.end method

.method private static createSubBitmapAndScale(Landroid/graphics/Bitmap;IIII)[I
    .locals 5

    .line 867
    invoke-static {p0, p1, p2, p3, p4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 868
    const/16 v0, 0x19

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 869
    invoke-static {v4}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFormFixedSizeBitmap(Landroid/graphics/Bitmap;)[I

    move-result-object v0

    return-object v0
.end method

.method private static getPixelsFormFixedSizeBitmap(Landroid/graphics/Bitmap;)[I
    .locals 9

    .line 900
    const/16 v0, 0x271

    new-array v8, v0, [I

    .line 901
    move-object v0, p0

    move-object v1, v8

    const/4 v2, 0x0

    const/16 v3, 0x19

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x19

    const/16 v7, 0x19

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 902
    return-object v8
.end method

.method private static getPixelsFromBitmap(Landroid/graphics/Bitmap;)[I
    .locals 4

    .line 795
    if-nez p0, :cond_0

    .line 796
    const-string v0, "HwColorPicker"

    const-string v1, "bitmap is null, can\'t be processed!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 797
    const/4 v0, 0x0

    return-object v0

    .line 800
    :cond_0
    const/16 v0, 0x19

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 801
    invoke-static {v3}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFormFixedSizeBitmap(Landroid/graphics/Bitmap;)[I

    move-result-object v0

    return-object v0
.end method

.method private static getPixelsFromBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)[I
    .locals 9

    .line 818
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 819
    :cond_0
    const-string v0, "HwColorPicker"

    const-string v1, "bitmap is null or rect is null, can\'t be processed!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 820
    const/4 v0, 0x0

    return-object v0

    .line 823
    :cond_1
    new-instance v4, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v4, v2, v3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 824
    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 825
    const-string v0, "HwColorPicker"

    const-string v1, "rect and bitmap\'s rect has not intersection, can\'t be processed!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 826
    const/4 v0, 0x0

    return-object v0

    .line 829
    :cond_2
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 830
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 831
    iget v0, v4, Landroid/graphics/Rect;->right:I

    iget v1, v4, Landroid/graphics/Rect;->left:I

    sub-int v7, v0, v1

    .line 832
    iget v0, v4, Landroid/graphics/Rect;->bottom:I

    iget v1, v4, Landroid/graphics/Rect;->top:I

    sub-int v8, v0, v1

    .line 834
    invoke-static {v7, v8}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isSmallSizeRect(II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 835
    invoke-static {p0, v5, v6, v7, v8}, Lhuawei/android/hwcolorpicker/HwColorPicker;->createSubBitmapAndScale(Landroid/graphics/Bitmap;IIII)[I

    move-result-object v0

    return-object v0

    .line 837
    :cond_3
    invoke-static {p0, v5, v6, v7, v8}, Lhuawei/android/hwcolorpicker/HwColorPicker;->scaleAndCreateSubBitmap(Landroid/graphics/Bitmap;IIII)[I

    move-result-object v0

    return-object v0
.end method

.method public static isColorPickerEnable()Z
    .locals 2

    .line 41
    sget-boolean v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->sIsLibColorPickerExist:Z

    if-nez v0, :cond_0

    .line 42
    const-string v0, "HwColorPicker"

    const-string v1, "lib colorPicker is not exist!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    :cond_0
    sget-boolean v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->sIsLibColorPickerExist:Z

    return v0
.end method

.method public static isDeviceSupport()Z
    .locals 1

    .line 54
    const/4 v0, 0x1

    return v0
.end method

.method public static isEnable()Z
    .locals 1

    .line 65
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isColorPickerEnable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isDeviceSupport()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isSmallSizeRect(II)Z
    .locals 5

    .line 852
    int-to-double v0, p0

    const-wide v2, -0x401eb851e0000000L    # -0.5400000214576721

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide v2, 0x40b60c8000000000L    # 5644.5

    mul-double/2addr v0, v2

    double-to-float v0, v0

    int-to-float v1, p1

    sub-float v4, v0, v1

    .line 853
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static processBitmap(Landroid/graphics/Bitmap;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 4

    .line 86
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 90
    :cond_0
    invoke-static {p0}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFromBitmap(Landroid/graphics/Bitmap;)[I

    move-result-object v3

    .line 92
    if-nez v3, :cond_1

    .line 93
    const-string v0, "HwColorPicker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPixelsFromBitmap("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "), return null!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 97
    :cond_1
    invoke-static {v3}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([I)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method public static processBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 4

    .line 119
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 123
    :cond_0
    invoke-static {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFromBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)[I

    move-result-object v3

    .line 125
    if-nez v3, :cond_1

    .line 126
    const-string v0, "HwColorPicker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPixelsFromBitmap("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "), return null!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 130
    :cond_1
    invoke-static {v3}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([I)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method public static processBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 4

    .line 186
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 190
    :cond_0
    invoke-static {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFromBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)[I

    move-result-object v3

    .line 192
    if-nez v3, :cond_1

    .line 193
    const-string v0, "HwColorPicker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPixelsFromBitmap("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "), return null!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 197
    :cond_1
    invoke-static {v3, p2}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method public static processBitmap(Landroid/graphics/Bitmap;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 4

    .line 152
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 156
    :cond_0
    invoke-static {p0}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFromBitmap(Landroid/graphics/Bitmap;)[I

    move-result-object v3

    .line 158
    if-nez v3, :cond_1

    .line 159
    const-string v0, "HwColorPicker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPixelsFromBitmap("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "), return null!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 163
    :cond_1
    invoke-static {v3, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method public static processBitmapAsync(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V
    .locals 1

    .line 256
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 257
    if-eqz p2, :cond_0

    .line 258
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    invoke-interface {p2, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;->onColorPicked(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    .line 260
    :cond_0
    return-void

    .line 262
    :cond_1
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {p0, p1, v0, p2}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmapAsync(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V

    .line 263
    return-void
.end method

.method public static processBitmapAsync(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V
    .locals 5

    .line 321
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 322
    if-eqz p3, :cond_0

    .line 323
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    invoke-interface {p3, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;->onColorPicked(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    .line 325
    :cond_0
    return-void

    .line 327
    :cond_1
    new-instance v3, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;

    const/4 v0, 0x0

    invoke-direct {v3, p3, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;-><init>(Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;Lhuawei/android/hwcolorpicker/HwColorPicker$1;)V

    .line 328
    new-instance v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;

    invoke-direct {v4, p0, p1, p2}, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)V

    .line 329
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/ref/WeakReference;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 330
    return-void
.end method

.method public static processBitmapAsync(Landroid/graphics/Bitmap;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V
    .locals 2

    .line 223
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 224
    if-eqz p1, :cond_0

    .line 225
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    invoke-interface {p1, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;->onColorPicked(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    .line 227
    :cond_0
    return-void

    .line 229
    :cond_1
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmapAsync(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V

    .line 230
    return-void
.end method

.method public static processBitmapAsync(Landroid/graphics/Bitmap;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V
    .locals 1

    .line 288
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 289
    if-eqz p2, :cond_0

    .line 290
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    invoke-interface {p2, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;->onColorPicked(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    .line 292
    :cond_0
    return-void

    .line 294
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmapAsync(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V

    .line 295
    return-void
.end method

.method private static processPixels([I)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 3

    .line 913
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 914
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 916
    :cond_0
    array-length v0, p0

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v1}, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->access$200(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v1

    invoke-static {p0, v0, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([III)[I

    move-result-object v2

    .line 917
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;-><init>([ILhuawei/android/hwcolorpicker/HwColorPicker$1;)V

    return-object v0
.end method

.method private static processPixels([ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 3

    .line 929
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 930
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker;->DEFAULT_COLOR:Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    return-object v0

    .line 932
    :cond_0
    array-length v0, p0

    if-eqz p1, :cond_1

    .line 933
    invoke-static {p1}, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->access$200(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v1}, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->access$200(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v1

    .line 932
    :goto_0
    invoke-static {p0, v0, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processPixels([III)[I

    move-result-object v2

    .line 934
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;-><init>([ILhuawei/android/hwcolorpicker/HwColorPicker$1;)V

    return-object v0
.end method

.method private static native processPixels([III)[I
.end method

.method private static scaleAndCreateSubBitmap(Landroid/graphics/Bitmap;IIII)[I
    .locals 8

    .line 883
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    mul-int/lit8 v0, v0, 0x19

    int-to-float v0, v0

    int-to-float v1, p3

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 884
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    mul-int/lit8 v0, v0, 0x19

    int-to-float v0, v0

    int-to-float v1, p4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 885
    mul-int/lit8 v0, p1, 0x19

    int-to-float v0, v0

    int-to-float v1, p3

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 886
    mul-int/lit8 v0, p2, 0x19

    int-to-float v0, v0

    int-to-float v1, p4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 888
    const/4 v0, 0x0

    invoke-static {p0, v2, v3, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 889
    const/16 v0, 0x19

    const/16 v1, 0x19

    invoke-static {v6, v4, v5, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 890
    invoke-static {v7}, Lhuawei/android/hwcolorpicker/HwColorPicker;->getPixelsFormFixedSizeBitmap(Landroid/graphics/Bitmap;)[I

    move-result-object v0

    return-object v0
.end method
