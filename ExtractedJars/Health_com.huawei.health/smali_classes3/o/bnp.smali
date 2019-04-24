.class public Lo/bnp;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/graphics/Paint;

.field private c:I

.field private d:I

.field private e:F

.field private f:F

.field private g:I

.field private h:J

.field private i:I

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 93
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bnp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 94
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 104
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bnp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 105
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 116
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    const/16 v0, 0x64

    iput v0, p0, Lo/bnp;->g:I

    .line 118
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    .line 120
    sget-object v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 123
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_roundColor:I

    const v1, -0x777778

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bnp;->a:I

    .line 124
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_roundProgressColor:I

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bnp;->d:I

    .line 125
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_textColor:I

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bnp;->c:I

    .line 126
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_textSize:I

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/bnp;->e:F

    .line 127
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_roundWidth:I

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lo/bnp;->f:F

    .line 128
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_max:I

    const/16 v1, 0x64

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/bnp;->g:I

    .line 129
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_textIsDisplayable:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/bnp;->k:Z

    .line 130
    sget v0, Lcom/huawei/android/sns/R$styleable;->RoundProgressBar_style:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lo/bnp;->i:I

    .line 132
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 133
    return-void
.end method

.method private declared-synchronized getMax()I
    .locals 2

    monitor-enter p0

    .line 206
    :try_start_0
    iget v0, p0, Lo/bnp;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private declared-synchronized getProgress()I
    .locals 3

    monitor-enter p0

    .line 230
    :try_start_0
    iget-wide v0, p0, Lo/bnp;->h:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v0, v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 139
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 143
    invoke-virtual {p0}, Lo/bnp;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    .line 145
    int-to-float v0, v6

    iget v1, p0, Lo/bnp;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v7, v0

    .line 147
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 149
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 151
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 153
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 155
    int-to-float v0, v6

    int-to-float v1, v6

    int-to-float v2, v7

    iget-object v3, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 158
    iget-boolean v0, p0, Lo/bnp;->k:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/bnp;->i:I

    if-nez v0, :cond_0

    .line 160
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 161
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 162
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->e:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 164
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 166
    invoke-direct {p0}, Lo/bnp;->getProgress()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {p0}, Lo/bnp;->getMax()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-int v8, v0

    .line 168
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    int-to-float v1, v6

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v9, v2

    sub-float/2addr v1, v2

    int-to-float v2, v6

    iget v3, p0, Lo/bnp;->e:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 176
    :cond_0
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 178
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bnp;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 180
    new-instance v8, Landroid/graphics/RectF;

    sub-int v0, v6, v7

    int-to-float v0, v0

    sub-int v1, v6, v7

    int-to-float v1, v1

    add-int v2, v6, v7

    int-to-float v2, v2

    add-int v3, v6, v7

    int-to-float v3, v3

    invoke-direct {v8, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 182
    iget v0, p0, Lo/bnp;->i:I

    if-nez v0, :cond_1

    .line 184
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 186
    move-object v0, p1

    move-object v1, v8

    invoke-direct {p0}, Lo/bnp;->getProgress()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    invoke-direct {p0}, Lo/bnp;->getMax()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v2, v3

    iget-object v5, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    .line 190
    :cond_1
    iget-object v0, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 191
    invoke-direct {p0}, Lo/bnp;->getProgress()I

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    move-object v0, p1

    move-object v1, v8

    invoke-direct {p0}, Lo/bnp;->getProgress()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v2, v3

    invoke-direct {p0}, Lo/bnp;->getMax()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v2, v3

    iget-object v5, p0, Lo/bnp;->b:Landroid/graphics/Paint;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 197
    :cond_2
    :goto_0
    return-void
.end method

.method public declared-synchronized setMax(I)V
    .locals 2

    monitor-enter p0

    .line 216
    if-gez p1, :cond_0

    .line 218
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "max not less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    iput p1, p0, Lo/bnp;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setProgress(I)V
    .locals 3

    monitor-enter p0

    .line 240
    move v2, p1

    .line 241
    if-gez v2, :cond_0

    .line 243
    const/4 v2, 0x0

    .line 245
    :cond_0
    :try_start_0
    iget v0, p0, Lo/bnp;->g:I

    if-le v2, v0, :cond_1

    .line 247
    iget v2, p0, Lo/bnp;->g:I

    .line 249
    :cond_1
    iget v0, p0, Lo/bnp;->g:I

    if-gt v2, v0, :cond_2

    .line 251
    int-to-long v0, v2

    iput-wide v0, p0, Lo/bnp;->h:J

    .line 252
    invoke-virtual {p0}, Lo/bnp;->postInvalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 254
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
