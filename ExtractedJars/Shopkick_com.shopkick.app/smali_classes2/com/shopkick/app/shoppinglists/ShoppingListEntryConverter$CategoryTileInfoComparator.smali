.class Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;
.super Ljava/lang/Object;
.source "ShoppingListEntryConverter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CategoryTileInfoComparator"
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
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$1;)V
    .locals 0

    .line 339
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I
    .locals 5

    .line 343
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v1, "TaxonomyNodeIdOther"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 344
    :cond_0
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    const-string v2, "TaxonomyNodeIdOther"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_1

    return v2

    .line 348
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 349
    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->access$100(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    move-result-object v0

    iget-object v3, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v0

    .line 350
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;

    .line 351
    invoke-static {v3}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;->access$100(Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    move-result-object v3

    iget-object v4, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v3

    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    .line 353
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    iget-object p2, v3, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    return v1

    :cond_3
    if-eqz v3, :cond_4

    return v2

    .line 357
    :cond_4
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 339
    check-cast p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter$CategoryTileInfoComparator;->compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I

    move-result p1

    return p1
.end method
