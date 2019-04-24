.class public Lo/bmw;
.super Landroid/widget/ImageView;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private e:I

.field private g:Landroid/graphics/Bitmap;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lo/bmw;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bmw;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 75
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x43200000    # 160.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmw;->c:I

    .line 49
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42500000    # 52.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmw;->a:I

    .line 55
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bmw;->k:I

    .line 76
    return-void
.end method

.method private b(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 108
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    :cond_0
    return-void

    .line 112
    :cond_1
    iget v2, p0, Lo/bmw;->c:I

    .line 115
    :try_start_0
    iget v0, p0, Lo/bmw;->a:I

    invoke-direct {p0}, Lo/bmw;->getMaxImageWidth()I

    move-result v1

    invoke-static {p1, v2, v0, v1}, Lo/boe;->e(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bmw;->g:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 124
    goto :goto_0

    .line 117
    :catch_0
    move-exception v3

    .line 119
    sget-object v0, Lo/bmw;->d:Ljava/lang/String;

    const-string v1, "initBitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    goto :goto_0

    .line 121
    :catch_1
    move-exception v3

    .line 123
    sget-object v0, Lo/bmw;->d:Ljava/lang/String;

    const-string v1, "initBitmap IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :goto_0
    iget-object v0, p0, Lo/bmw;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lo/bmw;->e:I

    .line 126
    iput v2, p0, Lo/bmw;->b:I

    .line 128
    invoke-direct {p0}, Lo/bmw;->getMaxImageWidth()I

    move-result v3

    .line 129
    iget v0, p0, Lo/bmw;->e:I

    if-le v0, v3, :cond_2

    .line 131
    iput v3, p0, Lo/bmw;->e:I

    .line 134
    :cond_2
    invoke-direct {p0}, Lo/bmw;->c()V

    .line 135
    return-void
.end method

.method private c()V
    .locals 3

    .line 155
    invoke-virtual {p0}, Lo/bmw;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 156
    if-eqz v2, :cond_0

    .line 158
    iget v0, p0, Lo/bmw;->e:I

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 159
    iget v0, p0, Lo/bmw;->b:I

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 160
    invoke-virtual {p0, v2}, Lo/bmw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 164
    :cond_0
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    iget v0, p0, Lo/bmw;->e:I

    iget v1, p0, Lo/bmw;->b:I

    invoke-direct {v2, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 165
    invoke-virtual {p0, v2}, Lo/bmw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 167
    :goto_0
    return-void
.end method

.method private d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    .line 187
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 188
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 189
    iget v0, p0, Lo/bmw;->e:I

    iget v1, p0, Lo/bmw;->b:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 190
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 191
    new-instance v7, Landroid/graphics/RectF;

    iget v0, p0, Lo/bmw;->e:I

    int-to-float v0, v0

    iget v1, p0, Lo/bmw;->b:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v7, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 192
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v6, v7, v0, v1, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 193
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 194
    iget v0, p0, Lo/bmw;->e:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bmw;->b:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v6, p1, v0, v1, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 195
    return-object v5
.end method

.method private getMaxImageWidth()I
    .locals 2

    .line 145
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->h()I

    move-result v1

    .line 147
    iget v0, p0, Lo/bmw;->k:I

    sub-int v0, v1, v0

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 172
    iget-object v0, p0, Lo/bmw;->g:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 174
    iget-object v0, p0, Lo/bmw;->g:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lo/bmw;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, Lo/bmw;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/bmw;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 177
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 201
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 202
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 203
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 204
    invoke-virtual {p0, v0, v1}, Lo/bmw;->setMeasuredDimension(II)V

    .line 205
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 3

    .line 96
    invoke-virtual {p0}, Lo/bmw;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 97
    invoke-static {v1}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 98
    invoke-direct {p0, v2}, Lo/bmw;->b(Landroid/graphics/Bitmap;)V

    .line 99
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 90
    invoke-direct {p0, p1}, Lo/bmw;->b(Landroid/graphics/Bitmap;)V

    .line 91
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 81
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    invoke-static {p1}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 83
    invoke-direct {p0, v0}, Lo/bmw;->b(Landroid/graphics/Bitmap;)V

    .line 84
    return-void
.end method
