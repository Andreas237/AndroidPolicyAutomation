.class public Lorg/researchstack/backbone/ui/views/IconTabLayout;
.super Landroid/support/design/widget/TabLayout;
.source "IconTabLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ui/views/IconTabLayout$OnTabSelectedListenerAdapter;
    }
.end annotation


# instance fields
.field private tabIconColor:I

.field private tabIconIndicatorColor:I

.field private tabTextColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/researchstack/backbone/ui/views/IconTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
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
    .line 23
    sget v0, Lorg/researchstack/backbone/R$attr;->icontablayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/views/IconTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3, "defStyleAttr"    # I

    .prologue
    const/4 v4, -0x1

    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/TabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    iput v4, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconColor:I

    .line 15
    const/high16 v3, -0x10000

    iput v3, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconIndicatorColor:I

    .line 16
    iput v4, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabTextColor:I

    .line 30
    sget-object v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout:[I

    sget v4, Lorg/researchstack/backbone/R$style;->Widget_Backbone_IconTabLayout:I

    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 35
    .local v0, "a":Landroid/content/res/TypedArray;
    sget v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout_android_background:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 36
    .local v1, "background":Landroid/graphics/drawable/Drawable;
    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    sget v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout_android_minHeight:I

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 39
    .local v2, "minHeight":I
    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->setMinimumHeight(I)V

    .line 41
    sget v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout_tabIconColor:I

    iget v4, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconColor:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconColor:I

    .line 42
    sget v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout_tabIconIndicatorColor:I

    iget v4, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconIndicatorColor:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconIndicatorColor:I

    .line 44
    sget v3, Lorg/researchstack/backbone/R$styleable;->IconTabLayout_tabTextColor:I

    iget v4, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabTextColor:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabTextColor:I

    .line 46
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    return-void
.end method

.method static synthetic lambda$addIconTab$16(Landroid/support/design/widget/TabLayout$Tab;Landroid/view/View;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 60
    invoke-virtual {p0}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    return-void
.end method


# virtual methods
.method public addIconTab(IIZZ)Landroid/support/design/widget/TabLayout$Tab;
    .locals 3
    .param p1, "title"    # I
    .param p2, "icon"    # I
    .param p3, "showIndicator"    # Z
    .param p4, "isSelected"    # Z

    .prologue
    .line 51
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->newTab()Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v1

    .line 52
    .local v1, "tabItem":Landroid/support/design/widget/TabLayout$Tab;
    new-instance v0, Lorg/researchstack/backbone/ui/views/IconTab;

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/researchstack/backbone/ui/views/IconTab;-><init>(Landroid/content/Context;)V

    .line 53
    .local v0, "iconTab":Lorg/researchstack/backbone/ui/views/IconTab;
    invoke-virtual {v0, p1}, Lorg/researchstack/backbone/ui/views/IconTab;->setText(I)V

    .line 54
    iget v2, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabTextColor:I

    invoke-virtual {v0, v2}, Lorg/researchstack/backbone/ui/views/IconTab;->setTextColor(I)V

    .line 55
    invoke-virtual {v0, p2}, Lorg/researchstack/backbone/ui/views/IconTab;->setIcon(I)V

    .line 56
    iget v2, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconColor:I

    invoke-virtual {v0, v2}, Lorg/researchstack/backbone/ui/views/IconTab;->setIconTint(I)V

    .line 57
    invoke-virtual {v0, p3}, Lorg/researchstack/backbone/ui/views/IconTab;->setIsIndicatorShow(Z)V

    .line 58
    iget v2, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout;->tabIconIndicatorColor:I

    invoke-virtual {v0, v2}, Lorg/researchstack/backbone/ui/views/IconTab;->setIndicatorTint(I)V

    .line 59
    invoke-virtual {v0, p4}, Lorg/researchstack/backbone/ui/views/IconTab;->setSelected(Z)V

    .line 60
    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;->lambdaFactory$(Landroid/support/design/widget/TabLayout$Tab;)Landroid/view/View$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/researchstack/backbone/ui/views/IconTab;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    invoke-virtual {v1, v0}, Landroid/support/design/widget/TabLayout$Tab;->setCustomView(Landroid/view/View;)Landroid/support/design/widget/TabLayout$Tab;

    .line 62
    if-eqz p4, :cond_0

    .line 64
    invoke-virtual {v1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    .line 66
    :cond_0
    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->addTab(Landroid/support/design/widget/TabLayout$Tab;)V

    .line 67
    return-object v1
.end method
