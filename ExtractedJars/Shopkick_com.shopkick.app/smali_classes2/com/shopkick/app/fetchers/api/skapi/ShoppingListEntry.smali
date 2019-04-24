.class public Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ShoppingListEntry.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public createdTimeMs:Ljava/lang/Long;

.field public deleted:Ljava/lang/Boolean;

.field public ingredientId:Ljava/lang/String;

.field public keywordId:Ljava/lang/String;

.field public keywordIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public parentShoppingListEntryId:Ljava/lang/String;

.field public priority:Ljava/lang/String;

.field public productFamilyId:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

.field public recipeId:Ljava/lang/String;

.field public shoppingListEntryId:Ljava/lang/String;

.field public state:Ljava/lang/Integer;

.field public taxonomyNodeId:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 2

    .line 47
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz p1, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .locals 1

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->postProcess()V

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->deleted:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->deleted:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method
