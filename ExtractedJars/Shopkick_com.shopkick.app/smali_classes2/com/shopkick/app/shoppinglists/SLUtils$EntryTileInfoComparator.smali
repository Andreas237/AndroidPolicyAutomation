.class public Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;
.super Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;
.source "SLUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EntryTileInfoComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;)V"
        }
    .end annotation

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;-><init>()V

    .line 104
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;->init(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I
    .locals 1

    .line 109
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 110
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 111
    :cond_1
    iget-object v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v0, :cond_2

    const/4 p1, -0x1

    return p1

    .line 112
    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 101
    check-cast p1, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;->compare(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)I

    move-result p1

    return p1
.end method
