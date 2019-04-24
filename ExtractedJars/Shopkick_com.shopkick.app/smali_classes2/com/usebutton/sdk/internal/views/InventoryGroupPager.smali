.class public Lcom/usebutton/sdk/internal/views/InventoryGroupPager;
.super Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;
.source "InventoryGroupPager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "InventoryGroupPager"


# instance fields
.field private final mGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/InventoryGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/InventoryGroup;",
            ">;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p3}, Lcom/usebutton/sdk/internal/views/InventoryPagerAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/util/Receiver;)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->mGroups:Ljava/util/List;

    .line 20
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->mGroups:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->mGroups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->mGroups:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/models/InventoryGroup;

    invoke-virtual {p1}, Lcom/usebutton/sdk/models/InventoryGroup;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->mGroups:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/usebutton/sdk/models/InventoryGroup;

    invoke-virtual {p2}, Lcom/usebutton/sdk/models/InventoryGroup;->getInventory()Ljava/util/List;

    move-result-object p2

    .line 31
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;->inflateInventoryList(Landroid/view/ViewGroup;Ljava/util/List;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
