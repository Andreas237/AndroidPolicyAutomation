.class Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$2;
.super Ljava/lang/Object;
.source "ShoppingListAnimationAdapter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->getHeaderPosition(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I
    .locals 4

    .line 376
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v1, "clientTaxonomyIdCompleted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 377
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v2, "clientTaxonomyIdCompleted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_1

    return v2

    .line 381
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v3, "TaxonomyNodeIdOther"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 382
    :cond_2
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v1, "TaxonomyNodeIdOther"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v2

    .line 385
    :cond_3
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 372
    check-cast p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$2;->compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I

    move-result p1

    return p1
.end method
