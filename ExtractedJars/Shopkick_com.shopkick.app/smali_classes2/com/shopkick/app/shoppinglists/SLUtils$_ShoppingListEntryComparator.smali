.class public Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;
.super Ljava/lang/Object;
.source "SLUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "_ShoppingListEntryComparator"
.end annotation


# instance fields
.field protected parentEntryMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->parentEntryMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected _compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I
    .locals 5

    .line 38
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 41
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 43
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 46
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->parentEntryMap:Ljava/util/Map;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    goto :goto_0

    :cond_2
    move-object v0, v3

    .line 49
    :goto_0
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 51
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v1

    .line 54
    :cond_3
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->parentEntryMap:Ljava/util/Map;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    :cond_4
    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {p0, v0, v3}, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1

    :cond_5
    if-nez v0, :cond_e

    if-eqz v3, :cond_6

    goto :goto_1

    .line 66
    :cond_6
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-eqz v0, :cond_8

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-eqz v0, :cond_8

    .line 68
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 70
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 72
    :cond_7
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1

    .line 75
    :cond_8
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-eqz v0, :cond_9

    return v2

    .line 76
    :cond_9
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-eqz v0, :cond_a

    return v1

    .line 78
    :cond_a
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 79
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 81
    :cond_b
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz p1, :cond_c

    return v2

    .line 82
    :cond_c
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    if-eqz p1, :cond_d

    return v1

    :cond_d
    const/4 p1, 0x0

    return p1

    :cond_e
    :goto_1
    if-nez v0, :cond_f

    .line 62
    invoke-virtual {p0, p1, v3}, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    goto :goto_2

    :cond_f
    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    :goto_2
    return p1
.end method

.method protected init(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 31
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 32
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;->parentEntryMap:Ljava/util/Map;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method
