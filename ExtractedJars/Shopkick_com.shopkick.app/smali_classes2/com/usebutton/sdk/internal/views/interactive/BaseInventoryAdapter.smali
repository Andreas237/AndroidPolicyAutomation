.class public abstract Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "BaseInventoryAdapter.java"


# static fields
.field public static final TAG:Ljava/lang/String; = "InventoryAdapter"


# instance fields
.field private final mItemHeight:I

.field private final mItemWidth:I

.field private final mItemWidthMax:I

.field private final mItemWidthMin:I

.field private final mRoot:Lcom/usebutton/sdk/InteractiveButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/InteractiveButton;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 25
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 27
    sget p2, Lcom/usebutton/sdk/R$dimen;->btn_inventory_width_min:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemWidthMin:I

    .line 29
    sget p2, Lcom/usebutton/sdk/R$dimen;->btn_inventory_width_max:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemWidthMax:I

    .line 30
    sget p2, Lcom/usebutton/sdk/R$dimen;->btn_inventory_width:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemWidth:I

    .line 31
    sget p2, Lcom/usebutton/sdk/R$dimen;->btn_inventory_height:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemHeight:I

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 36
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getInflater()Landroid/view/LayoutInflater;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-virtual {v0}, Lcom/usebutton/sdk/InteractiveButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public getItemHeight()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemHeight:I

    return v0
.end method

.method protected getItemLayoutParams()Landroid/support/v4/view/ViewPager$LayoutParams;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 66
    new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V

    const/4 v1, -0x2

    .line 67
    iput v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I

    .line 68
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->getItemWidth()I

    move-result v1

    iput v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I

    return-object v0
.end method

.method public getItemWidth()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemWidth:I

    return v0
.end method

.method public getPageWidth(I)F
    .locals 2

    .line 48
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-virtual {p1}, Lcom/usebutton/sdk/InteractiveButton;->getWidth()I

    move-result p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-virtual {v0}, Lcom/usebutton/sdk/InteractiveButton;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p1, v0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-virtual {v0}, Lcom/usebutton/sdk/InteractiveButton;->getPaddingRight()I

    move-result v0

    sub-int/2addr p1, v0

    if-nez p1, :cond_0

    const p1, 0x3f4ccccd    # 0.8f

    return p1

    .line 52
    :cond_0
    iget v0, p0, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;->mItemWidth:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float p1, p1

    div-float/2addr v0, p1

    return v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public notifyDataSetChanged()V
    .locals 2

    .line 74
    invoke-super {p0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    const-string v0, "InventoryAdapter"

    const-string v1, "Dataset changed"

    .line 75
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
