.class public Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "TabFragmentPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;
    }
.end annotation


# static fields
.field public static final TAB_CHANGED_EVENT:Ljava/lang/String; = "tabChangedEvent"


# instance fields
.field private activityClazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field protected appScreens:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

.field private final mFragmentManager:Landroid/support/v4/app/FragmentManager;

.field private onTabScreenChangedListener:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;

.field private pageIdentifierParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field private shouldDeleteScreens:Z

.field private tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;

.field private tabBarItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/activities/TabBarItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/app/FragmentManager;Lcom/shopkick/app/application/ScreenGlobals;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/support/v4/app/FragmentManager;",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/activities/DefaultTabBarConfig;",
            ">;)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    .line 42
    iput-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;

    .line 59
    iput-object p2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->context:Landroid/content/Context;

    .line 61
    iput-object p3, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 62
    iput-object p4, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->activityClazz:Ljava/lang/Class;

    .line 63
    iput-object p5, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->pageIdentifierParams:Ljava/util/Map;

    .line 66
    :try_start_0
    invoke-virtual {p6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/DefaultTabBarConfig;

    iput-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 68
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 71
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->loadTabBarItems()V

    return-void
.end method

.method private clearAppScreens()V
    .locals 3

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 231
    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_0

    .line 233
    :cond_1
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    const/4 v0, 0x0

    .line 235
    iput-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    return-void
.end method

.method private createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;
    .locals 3

    const/4 v0, 0x0

    .line 241
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v0, 0x1

    .line 243
    :try_start_1
    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/AppScreen;->setHasOptionsMenu(Z)V

    .line 245
    invoke-direct {p0, v1, p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setupScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/activities/PageIdentifierV2;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    goto :goto_0

    :catch_5
    move-exception p1

    :goto_0
    move-object v1, v0

    .line 247
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-object v1
.end method

.method private loadTabBarItems()V
    .locals 8

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v0

    .line 188
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;

    iget-object v2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/activities/DefaultTabBarConfig;->getTabContextOrder(Lcom/shopkick/app/application/ScreenGlobals;)Ljava/util/List;

    move-result-object v1

    .line 191
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    .line 192
    iget-object v2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;

    iget-object v3, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/activities/DefaultTabBarConfig;->getDefaultTabContextToTitleMap(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v2

    .line 194
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 195
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 196
    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextToTitleMapOverride:Ljava/util/Map;

    if-eqz v5, :cond_1

    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabContextToTitleMapOverride:Ljava/util/Map;

    .line 197
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    if-eqz v5, :cond_2

    move-object v4, v5

    .line 200
    :cond_2
    iget-object v5, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarConfig:Lcom/shopkick/app/activities/DefaultTabBarConfig;

    iget-object v6, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v6, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 201
    invoke-virtual {v5, v6}, Lcom/shopkick/app/activities/DefaultTabBarConfig;->getTabContextToScreenMap(Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    if-eqz v5, :cond_0

    .line 203
    iget-object v6, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    new-instance v7, Lcom/shopkick/app/activities/TabBarItem;

    invoke-direct {v7, v3, v5, v4}, Lcom/shopkick/app/activities/TabBarItem;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 210
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->clearAppScreens()V

    .line 211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/TabBarItem;

    .line 213
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    iget-object v3, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->activityClazz:Ljava/lang/Class;

    iget-object v1, v1, Lcom/shopkick/app/activities/TabBarItem;->rootClass:Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v1, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 214
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->pageIdentifierParams:Ljava/util/Map;

    if-eqz v1, :cond_5

    .line 215
    invoke-virtual {v2, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->setParams(Ljava/util/Map;)V

    .line 217
    :cond_5
    invoke-direct {p0, v2}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 219
    iget-object v2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    return-void
.end method

.method private recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 379
    :cond_0
    iget-object v1, p2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, v1, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0x6d

    .line 380
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 381
    :goto_1
    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p1, p1, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    .line 382
    iget-object p2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    invoke-virtual {p2, v1, v0, p1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->recordGoToScreen(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method private setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;ILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/TabLayout;",
            "Landroid/support/v4/view/ViewPager;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-gez p3, :cond_0

    return-void

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 142
    invoke-virtual {v0, p4}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    .line 144
    invoke-virtual {p0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object p4

    if-nez p4, :cond_1

    .line 147
    invoke-virtual {p2, p3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-virtual {p1, p3}, Landroid/support/design/widget/TabLayout;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 154
    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->select()V

    :cond_2
    :goto_0
    return-void
.end method

.method private setupScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/activities/PageIdentifierV2;)V
    .locals 10

    .line 254
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 256
    new-instance v0, Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v4, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v6, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v7, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v8, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/logging/UserEventLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;Ljava/lang/Integer;)V

    .line 263
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 265
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p1, p2, v1, v0}, Lcom/shopkick/app/screens/AppScreen;->attach(Lcom/shopkick/app/activities/PageIdentifierV2;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->clearAppScreens()V

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->onTabScreenChangedListener:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 303
    iget-boolean p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->shouldDeleteScreens:Z

    if-eqz p1, :cond_0

    return-void

    .line 307
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    check-cast p3, Landroid/support/v4/app/Fragment;

    invoke-virtual {p1, p3}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 308
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/TabBarItem;

    iget-object p1, p1, Lcom/shopkick/app/activities/TabBarItem;->title:Ljava/lang/String;

    return-object p1
.end method

.method public getTabBarItem(I)Lcom/shopkick/app/activities/TabBarItem;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/TabBarItem;

    return-object p1
.end method

.method public getTabIndex(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 175
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/TabBarItem;

    iget-object v1, v1, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/high16 p1, -0x80000000

    return p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/screens/AppScreen;

    .line 277
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 278
    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_0

    .line 280
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 283
    :goto_0
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    return-object p2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 313
    check-cast p2, Landroid/support/v4/app/Fragment;

    invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public reloadTabsPager(Landroid/support/v4/view/ViewPager;)V
    .locals 1

    const/4 v0, 0x1

    .line 167
    iput-boolean v0, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->shouldDeleteScreens:Z

    .line 168
    invoke-direct {p0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->loadTabBarItems()V

    .line 169
    invoke-virtual {p1, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    const/4 p1, 0x0

    .line 170
    iput-boolean p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->shouldDeleteScreens:Z

    return-void
.end method

.method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    return-void
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/TabLayout;",
            "Landroid/support/v4/view/ViewPager;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 129
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 130
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/TabBarItem;

    iget-object v1, v1, Lcom/shopkick/app/activities/TabBarItem;->rootClass:Ljava/lang/Class;

    if-ne p3, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 135
    :goto_1
    invoke-direct {p0, p1, p2, v0, p4}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;ILjava/util/Map;)V

    return-void
.end method

.method public setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 101
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->tabBarItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/TabBarItem;

    iget-object v1, v1, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 107
    :goto_1
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->setCurrentTab(Landroid/support/design/widget/TabLayout;Landroid/support/v4/view/ViewPager;ILjava/util/Map;)V

    return-void
.end method

.method public setOnTabScreenChangedListener(Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->onTabScreenChangedListener:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;

    return-void
.end method

.method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 337
    check-cast p3, Lcom/shopkick/app/tabs/TabScreen;

    .line 338
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    if-eq p3, p1, :cond_3

    if-eqz p1, :cond_0

    .line 340
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getParams()Ljava/util/Map;

    move-result-object p1

    const-string p2, "screenParamBackTargetScreen"

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/AppScreen;->setMenuVisibility(Z)V

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/screens/AppScreen;->setUserVisibleHint(Z)V

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->screenWillHide()V

    .line 344
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->screenDidHide()V

    :cond_0
    if-eqz p3, :cond_3

    const/4 p1, 0x1

    .line 347
    invoke-virtual {p3, p1}, Lcom/shopkick/app/tabs/TabScreen;->setMenuVisibility(Z)V

    .line 348
    invoke-virtual {p3, p1}, Lcom/shopkick/app/tabs/TabScreen;->setUserVisibleHint(Z)V

    .line 351
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_1

    iget-object p1, p3, Lcom/shopkick/app/tabs/TabScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_1

    const/16 p1, 0x6d

    .line 354
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/shopkick/app/tabs/TabScreen;->setOriginElement(Ljava/lang/Integer;)V

    .line 355
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p1, p1, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/tabs/TabScreen;->setOriginScreenEnum(Ljava/lang/Integer;)V

    .line 357
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {p0, p3, p1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/screens/AppScreen;)V

    .line 360
    iput-object p3, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->mCurrentPrimaryItem:Lcom/shopkick/app/screens/AppScreen;

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->onTabScreenChangedListener:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;

    if-eqz p1, :cond_2

    .line 362
    invoke-interface {p1, p3}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter$OnTabScreenChangedListener;->onTabScreenChanged(Lcom/shopkick/app/screens/AppScreen;)V

    .line 368
    :cond_2
    invoke-virtual {p3}, Lcom/shopkick/app/tabs/TabScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p2, p2, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    if-ne p1, p2, :cond_3

    .line 369
    invoke-virtual {p3}, Lcom/shopkick/app/tabs/TabScreen;->screenWillShow()V

    .line 370
    invoke-virtual {p3}, Lcom/shopkick/app/tabs/TabScreen;->screenDidShow()V

    :cond_3
    return-void
.end method
