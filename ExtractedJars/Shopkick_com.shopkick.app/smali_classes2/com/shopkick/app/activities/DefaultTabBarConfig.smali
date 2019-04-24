.class public abstract Lcom/shopkick/app/activities/DefaultTabBarConfig;
.super Ljava/lang/Object;
.source "DefaultTabBarConfig.java"


# instance fields
.field public DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/DefaultTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/DefaultTabBarConfig;->DEFAULT_TAB_CONTEXT_TO_TITLE_MAP:Ljava/util/Map;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/DefaultTabBarConfig;->TAB_CONTEXT_TO_SCREEN_MAP:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public abstract getDefaultTabContextToTitleMap(Landroid/content/Context;)Ljava/util/Map;
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
.end method

.method public getTabContextOrder(Lcom/shopkick/app/application/ScreenGlobals;)Ljava/util/List;
    .locals 0
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

    .line 31
    iget-object p1, p0, Lcom/shopkick/app/activities/DefaultTabBarConfig;->DEFAULT_TAB_CONTEXT_ORDER:Ljava/util/List;

    return-object p1
.end method

.method public abstract getTabContextToScreenMap(Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Map;
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
.end method
