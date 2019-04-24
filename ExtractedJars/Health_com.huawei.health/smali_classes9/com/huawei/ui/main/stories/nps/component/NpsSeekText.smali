.class public Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private height:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPaint1:Landroid/graphics/Paint;

.field private width:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->intPaint()V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->intPaint()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->intPaint()V

    .line 32
    return-void
.end method

.method private intPaint()V
    .locals 2

    .line 35
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    .line 36
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint1:Landroid/graphics/Paint;

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint1:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint1:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 56
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 57
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0xb

    if-ge v4, v0, :cond_0

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->width:I

    mul-int/2addr v1, v4

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->height:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 57
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 60
    :cond_0
    const-string v0, "10"

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->width:I

    int-to-float v1, v1

    const/high16 v2, 0x429a0000    # 77.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42a00000    # 80.0f

    div-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->height:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 61
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 48
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->width:I

    .line 49
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->height:I

    .line 50
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->width:I

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->height:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsSeekText;->setMeasuredDimension(II)V

    .line 52
    return-void
.end method
