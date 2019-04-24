.class public Lcom/shopkick/app/widget/SKTextView;
.super Landroid/support/v7/widget/AppCompatTextView;
.source "SKTextView.java"


# instance fields
.field private strikethrough:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/SKTextView;->checkAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKTextView;->checkAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/SKTextView;->checkAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private checkAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 41
    sget-object v0, Lcom/shopkick/app/R$styleable;->SKTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKTextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 47
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 p2, 0x1

    .line 48
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/shopkick/app/widget/SKTextView;->strikethrough:Z

    .line 50
    :cond_1
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 53
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public getTextWidth(Ljava/lang/String;)I
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public setDefaultFont(I)Z
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKTextView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/widget/SKTypeface;->getDefaultTypeface(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 74
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public setText(Ljava/lang/String;)V
    .locals 4

    .line 126
    iget-boolean v0, p0, Lcom/shopkick/app/widget/SKTextView;->strikethrough:Z

    if-eqz v0, :cond_0

    .line 127
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 128
    new-instance v1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v3, 0x21

    invoke-interface {v0, v1, v2, p1, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 129
    invoke-super {p0, v0}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 131
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setTextColorResource(I)V
    .locals 1

    .line 122
    invoke-virtual {p0}, Lcom/shopkick/app/widget/SKTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 86
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    return-void

    .line 94
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    invoke-super {p0, p1}, Landroid/support/v7/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    return-void
.end method
