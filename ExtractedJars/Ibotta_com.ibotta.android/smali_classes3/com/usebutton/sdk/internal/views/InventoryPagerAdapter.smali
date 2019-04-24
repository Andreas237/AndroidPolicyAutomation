.class public abstract Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "InventoryPagerAdapter.java"


# instance fields
.field private final mInflater:Landroid/view/LayoutInflater;

.field protected final mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    const-string v0, "layout_inflater"

    .line 24
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 25
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    return-void
.end method

.method private createInventoryView(Lcom/usebutton/sdk/models/Inventory;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_inventory_two_line:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 64
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;

    .line 66
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-virtual {v0, p1, v1, v2}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V

    return-object v0
.end method


# virtual methods
.method public destroyItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    .line 53
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 58
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public abstract getCount()I
.end method

.method protected inflateInventoryList(Landroid/view/ViewGroup;Ljava/util/List;)Landroid/view/View;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_inventory_group:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    .line 39
    sget v1, Lcom/usebutton/sdk/R$id;->group_items:I

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 41
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/models/Inventory;

    .line 42
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;->createInventoryView(Lcom/usebutton/sdk/models/Inventory;)Landroid/view/View;

    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v0, v0}, Landroid/widget/ScrollView;->setTag(Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 32
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
