.class public Lorg/researchstack/backbone/ui/views/SubmitBar;
.super Landroid/widget/LinearLayout;
.source "SubmitBar.java"


# instance fields
.field private negativeView:Landroid/widget/TextView;

.field private positiveView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/researchstack/backbone/ui/views/SubmitBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 29
    sget v0, Lorg/researchstack/backbone/R$attr;->submitbarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/views/SubmitBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_view_submitbar:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 38
    sget-object v1, Lorg/researchstack/backbone/R$styleable;->SubmitBar:[I

    sget v2, Lorg/researchstack/backbone/R$style;->Widget_Backbone_SubmitBar:I

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 43
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v1, Lorg/researchstack/backbone/R$styleable;->SubmitBar_android_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    sget v1, Lorg/researchstack/backbone/R$id;->bar_submit_postitive:I

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/views/SubmitBar;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    .line 46
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    sget v2, Lorg/researchstack/backbone/R$styleable;->SubmitBar_positiveActionTitle:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    sget v2, Lorg/researchstack/backbone/R$styleable;->SubmitBar_positiveActionColor:I

    .line 48
    invoke-static {p1}, Lorg/researchstack/backbone/utils/ThemeUtils;->getAccentColor(Landroid/content/Context;)I

    move-result v3

    .line 47
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 50
    sget v1, Lorg/researchstack/backbone/R$id;->bar_submit_negative:I

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/views/SubmitBar;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    .line 51
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    sget v2, Lorg/researchstack/backbone/R$styleable;->SubmitBar_negativeActionTitle:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    sget v2, Lorg/researchstack/backbone/R$styleable;->SubmitBar_negativeActionColor:I

    sget v3, Lorg/researchstack/backbone/R$color;->rsb_submit_bar_negative:I

    .line 53
    invoke-static {p1, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    .line 52
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    return-void
.end method


# virtual methods
.method public getNegativeActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    return-object v0
.end method

.method public getPositiveActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    return-object v0
.end method

.method public setNegativeAction(Lrx/functions/Action1;)V
    .locals 1
    .param p1, "submit"    # Lrx/functions/Action1;

    .prologue
    .line 99
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 100
    return-void
.end method

.method public setNegativeTitle(I)V
    .locals 1
    .param p1, "title"    # I

    .prologue
    .line 89
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setNegativeTitle(Ljava/lang/String;)V

    .line 90
    return-void
.end method

.method public setNegativeTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 94
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->negativeView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    return-void
.end method

.method public setPositiveAction(Lrx/functions/Action1;)V
    .locals 1
    .param p1, "submit"    # Lrx/functions/Action1;

    .prologue
    .line 74
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 75
    return-void
.end method

.method public setPositiveTitle(I)V
    .locals 1
    .param p1, "title"    # I

    .prologue
    .line 64
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveTitle(Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method public setPositiveTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 69
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SubmitBar;->positiveView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    return-void
.end method
