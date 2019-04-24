.class public Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;
.super Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;
.source "SingleInventoryAdapter.java"


# instance fields
.field private final mInventory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation
.end field

.field private final mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/models/InventoryGroup;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;",
            "Lcom/usebutton/sdk/models/InventoryGroup;",
            ")V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/util/Receiver;)V

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->mInventory:Ljava/util/List;

    .line 20
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->mInventory:Ljava/util/List;

    invoke-virtual {p3}, Lcom/usebutton/sdk/models/InventoryGroup;->getInventory()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 21
    invoke-virtual {p3}, Lcom/usebutton/sdk/models/InventoryGroup;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->mTitle:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 0

    .line 36
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->mTitle:Ljava/lang/String;

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 0

    .line 31
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->mInventory:Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;->inflateInventoryList(Landroid/view/ViewGroup;Ljava/util/List;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
