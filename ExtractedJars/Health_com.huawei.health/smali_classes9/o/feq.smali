.class public Lo/feq;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private d:Landroid/text/TextPaint;

.field e:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/feq;->e:Landroid/graphics/Rect;

    .line 25
    invoke-direct {p0}, Lo/feq;->b()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/feq;->e:Landroid/graphics/Rect;

    .line 30
    invoke-direct {p0}, Lo/feq;->b()V

    .line 32
    sget-object v0, Lcom/huawei/ui/main/R$styleable;->verticaltextview:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 33
    sget v0, Lcom/huawei/ui/main/R$styleable;->verticaltextview_verticalText:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/feq;->b:Ljava/lang/String;

    .line 36
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$styleable;->verticaltextview_verticalTextSize:I

    const/16 v1, 0xf

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v5

    .line 37
    if-lez v5, :cond_1

    .line 38
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    int-to-float v1, v5

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 40
    :cond_1
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    sget v1, Lcom/huawei/ui/main/R$styleable;->verticaltextview_verticalTextColor:I

    const/high16 v2, -0x1000000

    invoke-virtual {v3, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 41
    sget v0, Lcom/huawei/ui/main/R$styleable;->verticaltextview_direction:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/feq;->a:I

    .line 42
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 44
    invoke-virtual {p0}, Lo/feq;->requestLayout()V

    .line 45
    invoke-virtual {p0}, Lo/feq;->invalidate()V

    .line 46
    return-void
.end method

.method private a(I)I
    .locals 4

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 100
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 102
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v2, v0, :cond_0

    .line 103
    move v1, v3

    goto :goto_0

    .line 105
    :cond_0
    iget-object v0, p0, Lo/feq;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 106
    const/high16 v0, -0x80000000

    if-ne v2, v0, :cond_1

    .line 107
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 110
    :cond_1
    :goto_0
    return v1
.end method

.method private b(I)I
    .locals 4

    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 84
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 86
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v2, v0, :cond_0

    .line 87
    move v1, v3

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lo/feq;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 90
    const/high16 v0, -0x80000000

    if-ne v2, v0, :cond_1

    .line 91
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 94
    :cond_1
    :goto_0
    return v1
.end method

.method private final b()V
    .locals 2

    .line 49
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    .line 50
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 51
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 52
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 53
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 54
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 115
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    invoke-virtual {p0}, Lo/feq;->getHeight()I

    move-result v8

    .line 120
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 121
    iget v0, p0, Lo/feq;->a:I

    if-nez v0, :cond_0

    .line 122
    invoke-virtual {p0}, Lo/feq;->getWidth()I

    move-result v0

    shr-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/feq;->e:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    sub-int v6, v0, v1

    .line 123
    int-to-float v0, v6

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 124
    int-to-float v0, v6

    int-to-float v1, v8

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {p0}, Lo/feq;->getWidth()I

    move-result v0

    shr-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/feq;->e:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    shr-int/lit8 v1, v1, 0x1

    add-int v6, v0, v1

    .line 127
    int-to-float v0, v6

    int-to-float v1, v8

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 128
    int-to-float v0, v6

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 130
    :goto_0
    move-object v0, p1

    iget-object v1, p0, Lo/feq;->b:Ljava/lang/String;

    move-object v2, v9

    iget-object v5, p0, Lo/feq;->d:Landroid/text/TextPaint;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 131
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 75
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    iget-object v1, p0, Lo/feq;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/feq;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v3, p0, Lo/feq;->e:Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 76
    .line 77
    invoke-direct {p0, p1}, Lo/feq;->b(I)I

    move-result v0

    .line 78
    invoke-direct {p0, p2}, Lo/feq;->a(I)I

    move-result v1

    .line 76
    invoke-virtual {p0, v0, v1}, Lo/feq;->setMeasuredDimension(II)V

    .line 79
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/feq;->b:Ljava/lang/String;

    .line 58
    invoke-virtual {p0}, Lo/feq;->requestLayout()V

    .line 59
    invoke-virtual {p0}, Lo/feq;->invalidate()V

    .line 60
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .line 69
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    .line 70
    invoke-virtual {p0}, Lo/feq;->invalidate()V

    .line 71
    return-void
.end method

.method public setTextSize(I)V
    .locals 2

    .line 63
    iget-object v0, p0, Lo/feq;->d:Landroid/text/TextPaint;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 64
    invoke-virtual {p0}, Lo/feq;->requestLayout()V

    .line 65
    invoke-virtual {p0}, Lo/feq;->invalidate()V

    .line 66
    return-void
.end method
