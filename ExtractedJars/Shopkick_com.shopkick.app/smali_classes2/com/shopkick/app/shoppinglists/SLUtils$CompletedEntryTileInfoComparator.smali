.class public Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;
.super Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;
.source "SLUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CompletedEntryTileInfoComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;",
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

    .line 120
    invoke-direct {p0, p1}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected _compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I
    .locals 2

    .line 125
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1

    .line 126
    :cond_1
    :goto_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    if-nez v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 127
    :cond_2
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    if-nez v0, :cond_3

    const/4 p1, -0x1

    return p1

    .line 128
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-super {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1

    .line 129
    :cond_4
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->priority:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
