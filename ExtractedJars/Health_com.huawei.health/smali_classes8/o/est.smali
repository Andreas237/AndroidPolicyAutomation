.class public Lo/est;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/est$b;
    }
.end annotation


# instance fields
.field private a:F

.field private b:Z

.field private c:F

.field d:Lo/est$b;

.field private e:Landroid/graphics/Paint;

.field private f:Z

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/est;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 42
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/est;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/est;->b:Z

    .line 38
    invoke-direct {p0, p1, p2}, Lo/est;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 47
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    .line 48
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/est;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 49
    invoke-virtual {p0}, Lo/est;->getTextSize()F

    move-result v0

    iput v0, p0, Lo/est;->a:F

    .line 50
    iget v0, p0, Lo/est;->a:F

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {p0, v1}, Lo/est;->c(F)I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 51
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {p0, v0}, Lo/est;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/est;->a:F

    .line 53
    :cond_0
    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {p0, v0}, Lo/est;->c(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/est;->c:F

    .line 54
    sget-object v0, Lcom/huawei/ui/commonui/R$styleable;->autoScaleTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 55
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->autoScaleTextView_auto_scale:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lo/est;->b:Z

    .line 56
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    return-void
.end method

.method private c()V
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/est;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/est;->d:Lo/est$b;

    if-eqz v0, :cond_0

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/est;->f:Z

    .line 90
    iget-object v0, p0, Lo/est;->d:Lo/est$b;

    invoke-interface {v0}, Lo/est$b;->d()V

    .line 92
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;I)V
    .locals 5

    .line 60
    if-lez p2, :cond_3

    .line 61
    iget-boolean v0, p0, Lo/est;->b:Z

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/est;->getTextSize()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 63
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    .line 64
    invoke-virtual {p0}, Lo/est;->getPaddingLeft()I

    move-result v0

    sub-int v0, p2, v0

    invoke-virtual {p0}, Lo/est;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float v0, v2, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lo/est;->i:I

    .line 65
    invoke-direct {p0}, Lo/est;->c()V

    .line 66
    return-void

    .line 68
    :cond_0
    invoke-virtual {p0}, Lo/est;->getPaddingLeft()I

    move-result v0

    sub-int v0, p2, v0

    invoke-virtual {p0}, Lo/est;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const v1, 0x40333333    # 2.8f

    mul-float v2, v0, v1

    .line 69
    iget v3, p0, Lo/est;->a:F

    .line 70
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 71
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    .line 72
    :goto_0
    iget v0, p0, Lo/est;->c:F

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    cmpl-float v0, v4, v2

    if-lez v0, :cond_2

    .line 73
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v3, v0

    .line 74
    iget v0, p0, Lo/est;->c:F

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_1

    .line 75
    iget v3, p0, Lo/est;->c:F

    .line 76
    goto :goto_1

    .line 78
    :cond_1
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 79
    iget-object v0, p0, Lo/est;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    goto :goto_0

    .line 81
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lo/est;->getPaddingLeft()I

    move-result v0

    sub-int v0, p2, v0

    invoke-virtual {p0}, Lo/est;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float v0, v4, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lo/est;->i:I

    .line 82
    invoke-direct {p0}, Lo/est;->c()V

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Lo/est;->setTextSize(IF)V

    .line 85
    :cond_3
    return-void
.end method


# virtual methods
.method public c(F)I
    .locals 3

    .line 121
    invoke-virtual {p0}, Lo/est;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 122
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public c(Lo/est$b;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/est;->d:Lo/est$b;

    .line 99
    return-void
.end method

.method public getTextLine()I
    .locals 1

    .line 29
    iget v0, p0, Lo/est;->i:I

    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 115
    if-eq p1, p3, :cond_0

    .line 116
    invoke-virtual {p0}, Lo/est;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/est;->e(Ljava/lang/String;I)V

    .line 118
    :cond_0
    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 108
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/est;->f:Z

    .line 110
    invoke-virtual {p0}, Lo/est;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/est;->getWidth()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/est;->e(Ljava/lang/String;I)V

    .line 111
    return-void
.end method
