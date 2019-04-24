.class public Lo/byi;
.super Landroid/widget/CheckBox;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byi;->setBackgroundColor(I)V

    .line 30
    sget-object v0, Lcom/huawei/health/suggestion/R$styleable;->SugCustomCheckBoxStyle:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 31
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->SugCustomCheckBoxStyle_sug_custom_box_type:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    .line 32
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 34
    if-nez v3, :cond_0

    .line 35
    invoke-direct {p0, p1}, Lo/byi;->e(Landroid/content/Context;)V

    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x1

    if-ne v3, v0, :cond_1

    .line 37
    invoke-direct {p0, p1}, Lo/byi;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 39
    :cond_1
    invoke-direct {p0, p1}, Lo/byi;->d(Landroid/content/Context;)V

    .line 41
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .line 48
    sget v0, Lcom/huawei/health/suggestion/R$attr;->sugSelectDrawable:I

    sget v1, Lcom/huawei/health/suggestion/R$attr;->sugUnselectDrawable:I

    invoke-direct {p0, p1, v0, v1}, Lo/byi;->c(Landroid/content/Context;II)V

    .line 49
    return-void
.end method

.method private c(Landroid/content/Context;II)V
    .locals 8

    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p2, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 62
    if-eqz v5, :cond_0

    .line 63
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 64
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 67
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p3, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 68
    if-eqz v6, :cond_1

    .line 69
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 70
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    :cond_1
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    .line 74
    new-instance v7, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 75
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v7, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 76
    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-virtual {v7, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 77
    invoke-virtual {p0, v7}, Lo/byi;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    :cond_2
    return-void

    :array_0
    .array-data 4
        0x10100a0
    .end array-data
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$attr;->sugSwitchOnDrawable:I

    sget v1, Lcom/huawei/health/suggestion/R$attr;->sugSwitchOffDrawable:I

    invoke-direct {p0, p1, v0, v1}, Lo/byi;->c(Landroid/content/Context;II)V

    .line 53
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 2

    .line 44
    sget v0, Lcom/huawei/health/suggestion/R$attr;->sugCheckDrawable:I

    sget v1, Lcom/huawei/health/suggestion/R$attr;->sugUncheckDrawable:I

    invoke-direct {p0, p1, v0, v1}, Lo/byi;->c(Landroid/content/Context;II)V

    .line 45
    return-void
.end method
