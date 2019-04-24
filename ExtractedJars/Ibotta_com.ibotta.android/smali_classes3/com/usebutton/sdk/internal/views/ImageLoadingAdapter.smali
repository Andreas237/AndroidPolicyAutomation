.class public Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "ImageLoadingAdapter.java"


# instance fields
.field private final mImages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation
.end field

.field private final mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private final mShouldPadImages:Z


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/ImageLoader;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/ImageLoader;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;Z)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 21
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mImages:Ljava/util/List;

    .line 22
    iput-boolean p3, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mShouldPadImages:Z

    .line 23
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    return-void
.end method

.method private scaleType(Lcom/usebutton/sdk/internal/models/Asset;)Landroid/widget/ImageView$ScaleType;
    .locals 1

    const-string v0, "fill"

    .line 53
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Asset;->getFillMode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 54
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 56
    :cond_0
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    return-object p1
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 62
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mImages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    .line 38
    new-instance v0, Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;-><init>(Landroid/content/Context;)V

    .line 39
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mImages:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/usebutton/sdk/internal/models/Asset;

    .line 40
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->scaleType(Lcom/usebutton/sdk/internal/models/Asset;)Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 41
    new-instance v1, Landroid/support/v4/view/ViewPager$LayoutParams;

    invoke-direct {v1}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V

    const/4 v2, -0x1

    .line 42
    iput v2, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I

    .line 43
    iput v2, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I

    .line 44
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    iget-boolean v1, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mShouldPadImages:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$dimen;->btn_promo_product_image_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    invoke-virtual {v0, v1, v1, v1, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setPadding(IIII)V

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/ImageLoadingAdapter;->mLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/views/AssetImageView;->loadAsset(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
