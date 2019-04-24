.class public abstract Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;
.super Ljava/lang/Object;
.source "BaseBinder.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/views/interactive/ViewBinder;


# instance fields
.field protected final mLeftSpace:Landroid/widget/Space;

.field protected final mLoadingDots:Lcom/usebutton/sdk/internal/views/LoadingDots;

.field protected final mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

.field protected final mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

.field protected final mRightSpace:Landroid/widget/Space;

.field protected final mRoot:Lcom/usebutton/sdk/InteractiveButton;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/InteractiveButton;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    .line 36
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_left_space:I

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/InteractiveButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Space;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mLeftSpace:Landroid/widget/Space;

    .line 37
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_right_space:I

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/InteractiveButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Space;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRightSpace:Landroid/widget/Space;

    .line 38
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview:I

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/InteractiveButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/PreviewView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    .line 39
    sget v0, Lcom/usebutton/sdk/R$id;->btn_inventory_pager:I

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/InteractiveButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    .line 40
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_loading:I

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/InteractiveButton;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/views/LoadingDots;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mLoadingDots:Lcom/usebutton/sdk/internal/views/LoadingDots;

    .line 41
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->stylePager(Landroid/support/v4/view/ViewPager;)V

    return-void
.end method

.method private stylePager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .line 45
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$dimen;->btn_inventory_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    const/4 v0, 0x2

    .line 46
    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    return-void
.end method


# virtual methods
.method public applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V
    .locals 4
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 57
    iget-object v0, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->textSize:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getLabel()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->textSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 59
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->textSize:Ljava/lang/Integer;

    .line 61
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-float v2, v2

    const v3, 0x3f47ae14    # 0.78f

    mul-float/2addr v2, v3

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 63
    :cond_0
    iget-object v0, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->backgroundColor:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->backgroundColor:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/InteractiveButton;->setBackgroundColor(I)V

    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->backgroundDrawableResource:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->backgroundDrawableResource:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/InteractiveButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->backgroundDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 73
    :goto_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->inventoryLeftPadding:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v2}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->setPaddingLeft(Landroid/view/View;Ljava/lang/Integer;)V

    .line 75
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getIcon()Lcom/usebutton/sdk/internal/views/AssetImageView;

    move-result-object v0

    .line 76
    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->iconSize:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    .line 77
    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_3

    const/4 v1, 0x4

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 83
    :goto_1
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 84
    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 85
    iget-object v2, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->iconSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 86
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mLeftSpace:Landroid/widget/Space;

    iget-object v1, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->drawablePaddingLeft:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->setWidth(Landroid/view/View;Ljava/lang/Integer;)V

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mRightSpace:Landroid/widget/Space;

    iget-object p1, p1, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->drawablePaddingRight:Ljava/lang/Integer;

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->setWidth(Landroid/view/View;Ljava/lang/Integer;)V

    return-void
.end method

.method public getPager()Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    return-object v0
.end method

.method public setMarginLeft(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 3

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 94
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 95
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 96
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    :cond_0
    return-void
.end method

.method public setPaddingLeft(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 101
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public setWidth(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    return-void
.end method
