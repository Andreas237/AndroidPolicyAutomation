.class public Lcom/huawei/openalliance/ad/views/ProgressButton;
.super Landroid/view/View;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field private d:Landroid/graphics/Rect;

.field private e:Landroid/graphics/Paint;

.field private f:I

.field private g:Ljava/lang/CharSequence;

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:F

.field private m:I

.field private n:I

.field private o:Landroid/graphics/drawable/Drawable;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:J

.field private final r:[B


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010077

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->h:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->k:I

    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    invoke-virtual {p0, p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->c()V

    return-void
.end method

.method private a(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 10

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int v5, p2, p3

    int-to-double v0, v5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPromptRect()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-double v2, v2

    div-double v6, v0, v2

    int-to-double v0, v4

    mul-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->f:I

    mul-int/2addr v0, v4

    int-to-double v0, v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPromptRect()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    sub-int v0, v4, v8

    sub-int/2addr v0, v9

    if-lez v0, :cond_0

    add-int v0, v8, v9

    sub-int/2addr v4, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    sub-int v0, v4, v8

    if-lez v0, :cond_1

    sub-int/2addr v4, v8

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method private a(II)V
    .locals 7

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v3

    move v4, p1

    move v5, p2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    :goto_0
    return-void
.end method

.method private a(IZZ)V
    .locals 7

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v2

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    if-lez v0, :cond_0

    int-to-float v0, p1

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    int-to-float v1, v1

    div-float v3, v0, v1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v3

    float-to-int v5, v0

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->invalidate()V

    :goto_1
    if-eqz p3, :cond_2

    invoke-virtual {p0, v3, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(FZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    :goto_2
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    :try_start_1
    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_fixedWidth:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->h:Z

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_maxWidth:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->i:I

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_minWidth:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->j:I

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_textSize:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_textColor:I

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->k:I

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_fontFamily:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_styleIndex:I

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->c:I

    sget v0, Lcom/huawei/openalliance/ad/R$styleable;->hiad_progress_button_hiad_typefaceIndex:I

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->b:I
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "ProgressButton"

    const-string v1, "initButtonAttr UnsupportedOperationException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "ProgressButton"

    const-string v1, "initButtonAttr RuntimeException"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catch_2
    move-exception v4

    const-string v0, "ProgressButton"

    const-string v1, "initButtonAttr error"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v5

    :try_start_9
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :cond_0
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v2

    throw v6

    :goto_1
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v7, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v7

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    sub-int v9, v0, v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    sub-int v10, v0, v1

    move-object v0, p1

    move-object v1, v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v3

    int-to-float v4, v9

    int-to-float v5, v10

    iget-object v6, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v7

    throw v11

    :goto_0
    return-void
.end method

.method private a(Landroid/graphics/Typeface;I)V
    .locals 4

    if-lez p2, :cond_4

    if-nez p1, :cond_0

    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setTypeface(Landroid/graphics/Typeface;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    xor-int/lit8 v0, v2, -0x1

    and-int v3, p2, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    and-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    and-int/lit8 v1, v3, 0x2

    if-eqz v1, :cond_3

    const/high16 v1, -0x41800000    # -0.25f

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSkewX(F)V

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSkewX(F)V

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_4
    return-void
.end method

.method private a(Ljava/lang/String;II)V
    .locals 2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void

    :cond_0
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :pswitch_1
    sget-object v1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :pswitch_2
    sget-object v1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    :goto_0
    invoke-direct {p0, v1, p3}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/graphics/Typeface;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(IZ)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(IZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method private c()V
    .locals 5

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->b:I

    iget v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->c:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Ljava/lang/String;II)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setClickable(Z)V

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    const-string v0, "..."

    const-string v1, "..."

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->f:I

    return-void
.end method

.method private d()V
    .locals 5

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    const-string v0, "..."

    const-string v1, "..."

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->f:I

    return-void
.end method

.method private e()V
    .locals 4

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getDrawableState()[I

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method private getText()Ljava/lang/CharSequence;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method protected a()V
    .locals 12

    iget-object v5, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v5

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingStart()I

    move-result v6

    if-gtz v6, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingLeft()I

    move-result v6

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingEnd()I

    move-result v7

    if-gtz v7, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingRight()I

    move-result v7

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int/2addr v0, v6

    add-int v8, v0, v7

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->h:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getWidth()I

    move-result v10

    if-gtz v10, :cond_2

    iget v10, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_2
    if-le v8, v10, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-direct {p0, v0, v8, v10}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    :cond_3
    iget v0, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gtz v0, :cond_4

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    goto/16 :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    iget v10, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v8, v10, :cond_9

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->i:I

    if-le v8, v0, :cond_6

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->i:I

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->i:I

    invoke-direct {p0, v0, v8, v1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v8, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->i:I

    goto :goto_0

    :cond_6
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->j:I

    if-ge v8, v0, :cond_7

    iget v8, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->j:I

    :cond_7
    :goto_0
    iput v8, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gtz v0, :cond_8

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_8
    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_9
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v11

    monitor-exit v5

    throw v11

    :goto_2
    return-void
.end method

.method a(FZ)V
    .locals 0

    return-void
.end method

.method a(IZ)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    if-le p1, v0, :cond_1

    iget p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    :cond_1
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    if-eq p1, v0, :cond_2

    iput p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->b(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;I)V
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_1
    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(II)V

    if-gez p2, :cond_2

    const/4 p2, 0x0

    :cond_2
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    if-le p2, v0, :cond_3

    iget p2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    :cond_3
    iput p2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(IZZ)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setProgress(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    :goto_2
    return-void
.end method

.method protected b()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->q:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2bc

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->q:J

    const/4 v0, 0x0

    return v0
.end method

.method protected drawableStateChanged()V
    .locals 2

    const-string v0, "ProgressButton"

    const-string v1, "drawableStateChanged"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->e()V

    return-void
.end method

.method public getProgress()I
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public getProgressDrawable()Landroid/graphics/drawable/Drawable;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public getPromptRect()Landroid/graphics/Rect;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->d:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public jumpDrawablesToCurrentState()V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v0

    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2

    :goto_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, v1, Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;->a:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->setProgress(I)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;->a(Landroid/os/Parcelable;)Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;

    move-result-object v3

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    iput v0, v3, Lcom/huawei/openalliance/ad/views/ProgressButton$SavedState;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v3

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(II)V

    return-void
.end method

.method public setFixedWidth(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->h:Z

    return-void
.end method

.method public setFontFamily(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->a:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->b:I

    iget v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->c:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public setMax(I)V
    .locals 4

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v2

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    if-eq p1, v0, :cond_2

    iput p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->n:I

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->postInvalidate()V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    if-le v0, p1, :cond_1

    iput p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    :cond_1
    iget v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->m:I

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/ProgressButton;->b(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    return-void
.end method

.method public setProgress(I)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 5

    const-string v0, "ProgressButton"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setText:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v3

    :try_start_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->g:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->a()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :goto_0
    return-void
.end method

.method protected setTextColor(I)V
    .locals 2

    iput p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->k:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->k:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setTextSize(F)V
    .locals 2

    iput p1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->l:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/ProgressButton;->d()V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->r:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/ProgressButton;->o:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
