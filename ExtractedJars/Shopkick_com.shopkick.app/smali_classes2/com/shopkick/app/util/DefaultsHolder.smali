.class public Lcom/shopkick/app/util/DefaultsHolder;
.super Ljava/lang/Object;
.source "DefaultsHolder.java"


# instance fields
.field private background:Landroid/graphics/drawable/Drawable;

.field private image:Landroid/graphics/drawable/Drawable;

.field private params:Landroid/view/ViewGroup$LayoutParams;

.field private scale:F

.field private text:Ljava/lang/String;

.field private textColor:Landroid/content/res/ColorStateList;

.field private textSize:F

.field private typeFace:Landroid/graphics/Typeface;

.field private visibility:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->scale:F

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->visibility:I

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->params:Landroid/view/ViewGroup$LayoutParams;

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->background:Landroid/graphics/drawable/Drawable;

    .line 32
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 33
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/shopkick/app/util/DefaultsHolder;->saveTextDefaults(Landroid/widget/TextView;)V

    .line 35
    :cond_0
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 36
    check-cast p1, Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lcom/shopkick/app/util/DefaultsHolder;->saveBackgroundImage(Landroid/widget/ImageView;)V

    :cond_1
    return-void
.end method

.method private resetImageDefaults(Landroid/widget/ImageView;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->image:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private resetTextDefaults(Landroid/widget/TextView;)V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->textColor:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->typeFace:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 71
    iget v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->textSize:F

    iget v1, p0, Lcom/shopkick/app/util/DefaultsHolder;->scale:F

    div-float/2addr v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->text:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private saveBackgroundImage(Landroid/widget/ImageView;)V
    .locals 0

    .line 49
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/util/DefaultsHolder;->image:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private saveTextDefaults(Landroid/widget/TextView;)V
    .locals 1

    .line 41
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->textColor:Landroid/content/res/ColorStateList;

    .line 42
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->typeFace:Landroid/graphics/Typeface;

    .line 43
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    iput v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->textSize:F

    .line 44
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 45
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/shopkick/app/util/DefaultsHolder;->text:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public resetDefaults(Landroid/view/View;)V
    .locals 1

    .line 53
    iget v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->visibility:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->params:Landroid/view/ViewGroup$LayoutParams;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/DefaultsHolder;->background:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 60
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/shopkick/app/util/DefaultsHolder;->resetTextDefaults(Landroid/widget/TextView;)V

    .line 63
    :cond_1
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 64
    check-cast p1, Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lcom/shopkick/app/util/DefaultsHolder;->resetImageDefaults(Landroid/widget/ImageView;)V

    :cond_2
    return-void
.end method
