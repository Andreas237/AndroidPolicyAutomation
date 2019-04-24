.class public Lcom/shopkick/app/activities/HomeTabBarConfig;
.super Lcom/shopkick/app/activities/DefaultTabBarConfig;
.source "HomeTabBarConfig.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/activities/DefaultTabBarConfig;-><init>()V

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    const-string v1, "earn"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    const-string v1, "browse"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    const-string v1, "invite"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    const-string v1, "browse"

    const-class v2, Lcom/shopkick/app/browse/BrowseScreen;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    const-string v1, "lists"

    const-class v2, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    const-string v1, "invite"

    const-class v2, Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    const-string v1, "earn"

    const-class v2, Lcom/shopkick/app/store/EarnScreen;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getDefaultTabContextToTitleMap(Landroid/content/Context;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    const-string v1, "browse"

    const v2, 0x7f110251

    .line 41
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    const-string v1, "lists"

    const v2, 0x7f11024f

    .line 43
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    const-string v1, "invite"

    const v2, 0x7f11024e

    .line 45
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    const-string v1, "earn"

    const v2, 0x7f11024d

    .line 47
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    return-object p1
.end method

.method public getTabContextOrder(Lcom/shopkick/app/application/ScreenGlobals;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p1

    .line 59
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    .line 60
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextOrderOverride:Ljava/util/List;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    .line 64
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 65
    iget-object v2, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    return-object p1

    :cond_2
    return-object p1
.end method

.method public getTabContextToScreenMap(Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;>;"
        }
    .end annotation

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/activities/HomeTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    return-object p1
.end method
