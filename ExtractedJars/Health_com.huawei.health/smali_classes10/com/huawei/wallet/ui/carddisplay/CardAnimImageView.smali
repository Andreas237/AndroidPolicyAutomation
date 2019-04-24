.class public Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Ljava/lang/String;

.field private c:Landroid/graphics/Bitmap;

.field private d:F

.field private e:Landroid/graphics/Bitmap;

.field private g:F

.field private i:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 4

    .line 69
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 70
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 71
    const-string v0, "CardAnimImageView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardAnimImageView, localPath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " productId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-static {}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->a()Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    .line 73
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 75
    const/4 v0, 0x2

    if-ne v0, p4, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$drawable;->bus_card_default:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$drawable;->card_default:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    .line 85
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 87
    iput-object p2, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->b:Ljava/lang/String;

    .line 88
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    .line 89
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 91
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$dimen;->card_num_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->d:F

    .line 92
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$dimen;->card_num_left_space:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->i:F

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$dimen;->card_num_bottom_space:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->g:F

    .line 96
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->a:Landroid/graphics/Paint;

    .line 97
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->a:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 101
    const-string v0, "*_63020000_01"

    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->a:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->a:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->d:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 108
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 4

    .line 136
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->c:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->getTop()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->b:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->i:F

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->g:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 147
    :cond_1
    return-void
.end method


# virtual methods
.method public getCardNumberString()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 129
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 130
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->d(Landroid/graphics/Canvas;)V

    .line 131
    return-void
.end method

.method public setCardBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->e:Landroid/graphics/Bitmap;

    .line 152
    return-void
.end method

.method public setCardNumberString(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->b:Ljava/lang/String;

    .line 118
    return-void
.end method

.method public setCardStateBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->c:Landroid/graphics/Bitmap;

    .line 123
    return-void
.end method
