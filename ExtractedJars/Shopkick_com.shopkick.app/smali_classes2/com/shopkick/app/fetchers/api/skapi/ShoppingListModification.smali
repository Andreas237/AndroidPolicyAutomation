.class public Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ShoppingListModification.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

.field public entryDeleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

.field public entryPriorityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

.field public entryQuantityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

.field public entryStateModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

.field public entryTitleModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

.field public entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

.field public nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

.field public shoppingListEntryId:Ljava/lang/String;

.field public uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;
    .locals 2

    .line 42
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;->postProcess()V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;->postProcess()V

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryStateModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryStateModification;->postProcess()V

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryQuantityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryQuantityModification;->postProcess()V

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryTitleModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryTitleModification;->postProcess()V

    .line 58
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryDeleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryDeleteModification;->postProcess()V

    .line 59
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->postProcess()V

    .line 60
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryPriorityModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntryPriorityModification;->postProcess()V

    :cond_7
    return-void
.end method
