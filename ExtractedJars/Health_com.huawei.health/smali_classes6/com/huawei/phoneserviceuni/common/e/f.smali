.class public Lcom/huawei/phoneserviceuni/common/e/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "UiUtils"

.field private static b:Landroid/widget/Toast; = null

.field private static final c:I = -0x1

.field private static d:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    .line 253
    const/4 v0, -0x1

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;I)F
    .locals 2

    .line 310
    int-to-float v0, p1

    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->i(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    return v0
.end method

.method public static a(IF)I
    .locals 5

    .line 315
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 317
    return p0

    .line 320
    :cond_0
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    .line 321
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v2

    .line 322
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v3

    .line 323
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    .line 324
    int-to-float v0, v1

    mul-float/2addr v0, p1

    float-to-int v1, v0

    .line 325
    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;)I
    .locals 2

    .line 39
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->i(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 40
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public static a(Landroid/content/Context;F)I
    .locals 3

    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 78
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static a(Landroid/content/Context;II)I
    .locals 5

    .line 330
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 340
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 342
    invoke-virtual {v3, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 350
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->d(Landroid/content/Context;)I

    move-result v0

    add-int/2addr v4, v0

    .line 354
    const-string v0, "UiUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getNavHeight  ========= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    return v4
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 12

    .line 98
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 103
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 106
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v3, v0

    .line 107
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v4, v0

    .line 109
    const/4 v0, 0x0

    cmpg-float v0, v3, v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_3

    .line 110
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_3
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 117
    int-to-float v5, p1

    .line 118
    int-to-float v6, p2

    .line 121
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gtz v0, :cond_4

    .line 122
    const/high16 v5, 0x439c0000    # 312.0f

    .line 124
    :cond_4
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gtz v0, :cond_5

    .line 125
    const/high16 v6, 0x43340000    # 180.0f

    .line 129
    :cond_5
    const/4 v7, 0x1

    .line 131
    div-float v0, v3, v5

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    .line 132
    div-float v0, v4, v6

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 134
    const/4 v0, 0x1

    if-gt v8, v0, :cond_6

    const/4 v0, 0x1

    if-le v9, v0, :cond_8

    .line 135
    :cond_6
    if-le v8, v9, :cond_7

    .line 137
    move v7, v8

    goto :goto_0

    .line 139
    :cond_7
    move v7, v9

    .line 147
    :cond_8
    :goto_0
    iput v7, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 148
    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 149
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 152
    const/4 v10, 0x0

    .line 154
    :try_start_0
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v10, v0

    .line 157
    goto :goto_1

    .line 155
    :catch_0
    move-exception v11

    .line 156
    const-string v0, "UiUtils"

    const-string v1, " get scale image error ,out of memory"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    :goto_1
    const/4 v11, 0x0

    .line 164
    if-eqz v10, :cond_9

    .line 165
    invoke-static {p0, v10}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 169
    :cond_9
    if-eqz v11, :cond_a

    if-eq v11, v10, :cond_a

    .line 170
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V

    .line 171
    move-object v10, v11

    .line 174
    :cond_a
    return-object v10
.end method

.method public static a(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .line 188
    const/4 v7, 0x0

    .line 190
    :try_start_0
    new-instance v8, Landroid/media/ExifInterface;

    invoke-direct {v8, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 191
    const-string v0, "Orientation"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v9

    .line 193
    const/4 v0, 0x1

    if-eq v9, v0, :cond_0

    .line 194
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 195
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    .line 197
    :sswitch_0
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 198
    goto :goto_0

    .line 200
    :sswitch_1
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 201
    goto :goto_0

    .line 203
    :sswitch_2
    const/high16 v0, 0x43870000    # 270.0f

    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 204
    .line 210
    :goto_0
    move-object v0, p1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 214
    :cond_0
    goto :goto_1

    .line 212
    :catch_0
    move-exception v8

    .line 213
    const-string v0, "UiUtils"

    const-string v1, " can not rotate the img"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_1
    return-object v7

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x6 -> :sswitch_0
        0x8 -> :sswitch_2
    .end sparse-switch
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 4

    .line 220
    const-string v0, "input_method"

    .line 221
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 222
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v3

    .line 223
    if-eqz v3, :cond_0

    .line 224
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 226
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 446
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Landroid/view/View;Z)V

    .line 447
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/view/View;Z)V
    .locals 4

    .line 462
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->g(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->g(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 465
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 60
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    :cond_0
    return-void

    .line 64
    :cond_1
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 65
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    goto :goto_0

    .line 67
    :cond_2
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 68
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 70
    :goto_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/f;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 71
    return-void
.end method

.method public static a(Landroid/widget/Button;I)V
    .locals 3

    .line 368
    if-nez p0, :cond_0

    .line 369
    const-string v0, "UiUtils"

    const-string v1, "setEmphasisButton button is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    return-void

    .line 372
    :cond_0
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    :try_start_0
    new-instance v0, Lcom/huawei/phoneserviceuni/common/e/g;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/e/g;-><init>()V

    invoke-virtual {p0, v0}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 392
    const-string v0, "#007dff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/Button;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 393
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    goto :goto_0

    .line 395
    :catch_0
    move-exception v2

    .line 396
    const-string v0, "UiUtils"

    const-string v1, "NoSuchMethodError::setBackgroundTintList"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Landroid/widget/Button;Landroid/content/Context;I)V
    .locals 1

    .line 530
    if-nez p1, :cond_0

    .line 531
    return-void

    .line 533
    :cond_0
    invoke-static {p1, p2}, Lcom/huawei/phoneserviceuni/common/e/f;->b(Landroid/content/Context;I)I

    move-result v0

    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/f;->b(Landroid/widget/Button;I)V

    .line 534
    return-void
.end method

.method public static b(Landroid/content/Context;F)I
    .locals 3

    .line 85
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 86
    div-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static b(Landroid/content/Context;I)I
    .locals 5

    .line 495
    const/4 v2, -0x1

    .line 496
    if-eqz p0, :cond_2

    .line 497
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    mul-int/lit8 v3, v0, 0x2

    .line 499
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 500
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;)I

    move-result v4

    .line 501
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 503
    div-int/lit8 v0, v4, 0x2

    sub-int v2, v0, v3

    goto :goto_0

    .line 506
    :cond_0
    div-int/lit8 v0, v4, 0x4

    sub-int v0, v4, v0

    sub-int v2, v0, v3

    .line 508
    :goto_0
    goto :goto_1

    .line 510
    .line 511
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 510
    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;I)F

    move-result v0

    float-to-int v0, v0

    sub-int v2, v0, v3

    .line 514
    :cond_2
    :goto_1
    return v2
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 5

    .line 406
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 407
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 408
    if-nez v2, :cond_0

    .line 409
    const-string v0, "UiUtils"

    const-string v1, "setDialogDown::w = null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    return-void

    .line 412
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 413
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    .line 414
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 415
    const/high16 v0, 0x41000000    # 8.0f

    mul-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 416
    const/16 v0, 0x50

    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 417
    goto :goto_0

    .line 418
    :cond_1
    const/16 v0, 0x11

    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 421
    :cond_2
    :goto_0
    return-void
.end method

.method public static b(Landroid/widget/Button;I)V
    .locals 0

    .line 547
    if-eqz p0, :cond_0

    if-lez p1, :cond_0

    .line 548
    invoke-virtual {p0, p1}, Landroid/widget/Button;->setWidth(I)V

    .line 550
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 235
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 2

    .line 245
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(Landroid/content/Context;)I
    .locals 6

    .line 262
    sget v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 265
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 267
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .line 269
    const-string v0, "status_bar_height"

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 271
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 272
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4

    .line 283
    goto :goto_0

    .line 273
    :catch_0
    move-exception v2

    .line 274
    const/4 v0, 0x0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    .line 283
    goto :goto_0

    .line 275
    :catch_1
    move-exception v2

    .line 276
    const/4 v0, 0x0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    .line 283
    goto :goto_0

    .line 277
    :catch_2
    move-exception v2

    .line 278
    const/4 v0, 0x0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    .line 283
    goto :goto_0

    .line 279
    :catch_3
    move-exception v2

    .line 280
    const/4 v0, 0x0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    .line 283
    goto :goto_0

    .line 281
    :catch_4
    move-exception v2

    .line 282
    const/4 v0, 0x0

    sput v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    .line 285
    :cond_0
    :goto_0
    sget v0, Lcom/huawei/phoneserviceuni/common/e/f;->d:I

    return v0
.end method

.method public static e(Landroid/content/Context;)I
    .locals 2

    .line 296
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->i(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 297
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 4

    .line 432
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v3, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 433
    const-string v0, "UiUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isPad::smallSW="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    const/16 v0, 0x212

    if-lt v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static g(Landroid/content/Context;)I
    .locals 2

    .line 475
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;)I

    move-result v1

    .line 477
    div-int/lit8 v0, v1, 0xc

    return v0

    .line 479
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Landroid/content/Context;)I
    .locals 5

    .line 557
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 558
    if-eqz v4, :cond_0

    .line 559
    return v4

    .line 561
    :cond_0
    const v0, 0x103006e

    return v0
.end method

.method private static i(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    .locals 3

    .line 51
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 52
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 53
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 54
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 56
    :cond_0
    return-object v1
.end method
