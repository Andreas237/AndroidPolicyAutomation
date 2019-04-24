.class public Lhuawei/widget/HwTextView;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field private mMinSize:F

.field private mSizeStep:F

.field private mStaticLayout:Landroid/text/StaticLayout;

.field private mTextPaint:Landroid/text/TextPaint;

.field private mTextSize:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhuawei/widget/HwTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwTextView;->initialise(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    return-void
.end method

.method private autoText(II)V
    .locals 8

    .line 101
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getMaxWidth()I

    move-result v2

    .line 102
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getMaxHeight()I

    move-result v3

    .line 103
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    if-ge v2, p1, :cond_0

    .line 104
    move p1, v2

    .line 106
    :cond_0
    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    if-ge v3, p2, :cond_1

    .line 107
    move p2, v3

    .line 109
    :cond_1
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    .line 110
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getTotalPaddingRight()I

    move-result v1

    sub-int v4, v0, v1

    .line 111
    if-gez v4, :cond_2

    .line 112
    return-void

    .line 114
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    if-nez v0, :cond_3

    .line 115
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    .line 117
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 118
    iget v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    iget v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 119
    iget v5, p0, Lhuawei/widget/HwTextView;->mTextSize:F

    .line 120
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 121
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 122
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v7

    .line 123
    :goto_0
    int-to-float v0, v4

    cmpl-float v0, v7, v0

    if-lez v0, :cond_4

    iget v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    cmpl-float v0, v5, v0

    if-lez v0, :cond_4

    .line 124
    iget v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    sub-float/2addr v5, v0

    .line 125
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 126
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v7

    goto :goto_0

    .line 128
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v5}, Lhuawei/widget/HwTextView;->setTextSize(IF)V

    .line 129
    invoke-direct {p0, p2, p1}, Lhuawei/widget/HwTextView;->measureHeight(II)V

    .line 131
    :cond_5
    return-void
.end method

.method private initialise(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 54
    sget-object v0, Lcom/huawei/hwtextview/R$styleable;->HwTextView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 55
    sget v0, Lcom/huawei/hwtextview/R$styleable;->HwTextView_hwAutoSizeMinTextSize:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    .line 56
    sget v0, Lcom/huawei/hwtextview/R$styleable;->HwTextView_hwAutoSizeStepGranularity:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    .line 57
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 59
    iget v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 60
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 61
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getAutoSizeMinTextSize()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    .line 62
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getAutoSizeStepGranularity()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    .line 63
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/HwTextView;->setAutoSizeTextTypeWithDefaults(I)V

    .line 66
    :cond_0
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    .line 67
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 68
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getTextSize()F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mTextSize:F

    .line 69
    return-void
.end method

.method private measureHeight(II)V
    .locals 14

    .line 134
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getMaxLines()I

    move-result v8

    .line 135
    const/4 v0, 0x1

    if-le v8, v0, :cond_2

    .line 136
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int v0, p2, v0

    .line 137
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getTotalPaddingRight()I

    move-result v1

    sub-int v9, v0, v1

    .line 138
    const/4 v10, 0x0

    .line 139
    const/4 v11, 0x0

    .line 140
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 141
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getExtendedPaddingBottom()I

    move-result v10

    .line 142
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getExtendedPaddingTop()I

    move-result v11

    .line 145
    :cond_0
    sub-int v0, p1, v10

    sub-int v12, v0, v11

    .line 146
    if-gtz v12, :cond_1

    .line 147
    return-void

    .line 149
    :cond_1
    new-instance v0, Landroid/text/StaticLayout;

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 151
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getLineSpacingMultiplier()F

    move-result v5

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getLineSpacingExtra()F

    move-result v6

    move v3, v9

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lhuawei/widget/HwTextView;->mStaticLayout:Landroid/text/StaticLayout;

    .line 152
    const-string v0, "luyifa"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getLineSpacingMultiplier()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    const-string v0, "luyifa"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getLineSpacingExtra()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mStaticLayout:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v13

    .line 155
    iget-object v0, p0, Lhuawei/widget/HwTextView;->mStaticLayout:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getHeight()I

    move-result v0

    if-le v0, v12, :cond_2

    const/4 v0, 0x1

    if-le v13, v0, :cond_2

    add-int/lit8 v0, v8, 0x1

    if-gt v13, v0, :cond_2

    .line 157
    add-int/lit8 v0, v13, -0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/HwTextView;->setMaxLines(I)V

    .line 160
    :cond_2
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .line 47
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 48
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 49
    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwTextView;->autoText(II)V

    .line 50
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 51
    return-void
.end method

.method public setAutoTextInfo(III)V
    .locals 4

    .line 81
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 83
    if-nez v2, :cond_0

    .line 84
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 88
    :goto_0
    int-to-float v0, p1

    .line 89
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 88
    invoke-static {p3, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mMinSize:F

    .line 90
    int-to-float v0, p2

    .line 91
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 90
    invoke-static {p3, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mSizeStep:F

    .line 92
    return-void
.end method

.method public setAutoTextSize(F)V
    .locals 1

    .line 163
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lhuawei/widget/HwTextView;->setAutoTextSize(IF)V

    .line 164
    return-void
.end method

.method public setAutoTextSize(IF)V
    .locals 3

    .line 167
    invoke-virtual {p0}, Lhuawei/widget/HwTextView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 169
    if-nez v1, :cond_0

    .line 170
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    goto :goto_0

    .line 172
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 174
    .line 175
    :goto_0
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 174
    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Lhuawei/widget/HwTextView;->mTextSize:F

    .line 176
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 177
    return-void
.end method
