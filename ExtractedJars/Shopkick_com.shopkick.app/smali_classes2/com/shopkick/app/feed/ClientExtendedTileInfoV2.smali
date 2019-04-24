.class public Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
.super Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
.source "ClientExtendedTileInfoV2.java"


# instance fields
.field public chainIds:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public header:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public isCollapsed:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public isLinked:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public message:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public product:Lcom/shopkick/app/fetchers/api/skapi/Product;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public shoppingListId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field

.field public simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    return-void
.end method

.method public static condense(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 6

    .line 65
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    .line 66
    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 68
    :try_start_0
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 69
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 70
    :cond_0
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-object v0
.end method

.method public static extend(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 6

    .line 50
    new-instance v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;-><init>()V

    .line 51
    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 53
    :try_start_0
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 54
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-object v0
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 1

    .line 40
    sget-object p1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 41
    invoke-static {p0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->extend(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public cloneObject(Z)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->cloneObject(Z)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->cloneObject(Z)Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 46
    invoke-static {p0}, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->condense(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
