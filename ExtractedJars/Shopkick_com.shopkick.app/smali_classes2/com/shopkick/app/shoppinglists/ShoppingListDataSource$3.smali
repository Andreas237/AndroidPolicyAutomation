.class Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$3;
.super Ljava/lang/Object;
.source "ShoppingListDataSource.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->onCategoryReadFromDisk(ILjava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V
    .locals 0

    .line 1407
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$3;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)I
    .locals 8

    .line 1410
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    if-nez v0, :cond_0

    return v1

    .line 1411
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    .line 1412
    :cond_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    const/4 v3, -0x1

    if-nez v0, :cond_2

    return v3

    .line 1413
    :cond_2
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_3

    move v1, v2

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->shoppingListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->createdTimeMs:Ljava/lang/Long;

    if-ne p1, p2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v3

    :goto_0
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1407
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$3;->compare(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)I

    move-result p1

    return p1
.end method
