.class Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$2;
.super Ljava/lang/Object;
.source "ShoppingListDataSource.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getExistingEntryWithId(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V
    .locals 0

    .line 1198
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$2;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I
    .locals 5

    .line 1201
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 1202
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1203
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_1

    return v2

    .line 1204
    :cond_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_2

    return v1

    .line 1205
    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long p1, v3, p1

    if-ltz p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1

    .line 1207
    :cond_4
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1198
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$2;->compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1
.end method
