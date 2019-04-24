.class public Lorg/researchstack/backbone/ui/graph/EmptyView;
.super Landroid/widget/FrameLayout;
.source "EmptyView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 20
    const/4 v0, 0x0

    sget v1, Lorg/researchstack/backbone/R$attr;->emptyviewStyle:I

    sget v2, Lorg/researchstack/backbone/R$style;->Widget_Backbone_EmptyView:I

    invoke-direct {p0, v0, v1, v2}, Lorg/researchstack/backbone/ui/graph/EmptyView;->init(Landroid/util/AttributeSet;II)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 25
    sget v0, Lorg/researchstack/backbone/R$attr;->emptyviewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    sget v0, Lorg/researchstack/backbone/R$attr;->emptyviewStyle:I

    sget v1, Lorg/researchstack/backbone/R$style;->Widget_Backbone_EmptyView:I

    invoke-direct {p0, p2, v0, v1}, Lorg/researchstack/backbone/ui/graph/EmptyView;->init(Landroid/util/AttributeSet;II)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget v0, Lorg/researchstack/backbone/R$style;->Widget_Backbone_EmptyView:I

    invoke-direct {p0, p2, p3, v0}, Lorg/researchstack/backbone/ui/graph/EmptyView;->init(Landroid/util/AttributeSet;II)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 39
    invoke-direct {p0, p2, p3, p4}, Lorg/researchstack/backbone/ui/graph/EmptyView;->init(Landroid/util/AttributeSet;II)V

    .line 40
    return-void
.end method

.method private init(Landroid/util/AttributeSet;II)V
    .locals 11
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "defStyleAttr"    # I
    .param p3, "defStyleRes"    # I

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x0

    .line 44
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    sget v7, Lorg/researchstack/backbone/R$layout;->rsb_view_empty:I

    const/4 v8, 0x1

    invoke-virtual {v6, v7, p0, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 46
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/graph/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v6

    sget-object v7, Lorg/researchstack/backbone/R$styleable;->EmptyView:[I

    invoke-virtual {v6, p1, v7, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 51
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v6, Lorg/researchstack/backbone/R$id;->view_empty_tv:I

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/ui/graph/EmptyView;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 52
    .local v5, "emptyTextView":Landroid/widget/TextView;
    sget v6, Lorg/researchstack/backbone/R$styleable;->EmptyView_emptyText:I

    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 53
    .local v3, "emptyText":Ljava/lang/String;
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    sget v6, Lorg/researchstack/backbone/R$styleable;->EmptyView_emptyTextAppearance:I

    invoke-virtual {v0, v6, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 56
    .local v4, "emptyTextAppearance":I
    invoke-virtual {v5}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 58
    sget v6, Lorg/researchstack/backbone/R$styleable;->EmptyView_emptyIconTint:I

    invoke-virtual {v0, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 59
    .local v2, "emptyIconTint":I
    sget v6, Lorg/researchstack/backbone/R$styleable;->EmptyView_emptyIcon:I

    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 61
    .local v1, "emptyIcon":Landroid/graphics/drawable/Drawable;
    if-eqz v1, :cond_1

    .line 63
    if-eqz v2, :cond_0

    .line 65
    invoke-static {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 66
    invoke-static {v1, v2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 69
    :cond_0
    invoke-virtual {v5, v9, v1, v9, v9}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 72
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    return-void
.end method
