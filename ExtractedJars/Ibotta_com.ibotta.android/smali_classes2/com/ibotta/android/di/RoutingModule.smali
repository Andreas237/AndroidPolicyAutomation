.class public abstract Lcom/ibotta/android/di/RoutingModule;
.super Ljava/lang/Object;
.source "RoutingModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideFeatureRouteHandler(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)Lcom/ibotta/android/view/featured/FeatureRouteHandler;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 146
    new-instance v0, Lcom/ibotta/android/view/featured/FeatureRouteHandler;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/featured/FeatureRouteHandler;-><init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    return-object v0
.end method

.method public static provideRouteCleaner(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 119
    new-instance v0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRouteHandler(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/ActivityLifecycleListener;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/routing/RouteHandler;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    new-instance v1, Lcom/ibotta/android/routing/area/NotificationsRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/NotificationsRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v1, Lcom/ibotta/android/routing/area/BonusesRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/BonusesRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v1, Lcom/ibotta/android/routing/area/CacheRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/CacheRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v1, Lcom/ibotta/android/routing/area/DealRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/DealRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v1, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;

    invoke-direct {v1, p1}, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v1, Lcom/ibotta/android/routing/area/SpotlightRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    new-instance v1, Lcom/ibotta/android/routing/area/ProductRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/ProductRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v1, Lcom/ibotta/android/routing/area/FindRebatesRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/FindRebatesRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v1, Lcom/ibotta/android/routing/area/GalleryRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/GalleryRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance v1, Lcom/ibotta/android/routing/area/HelpRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/HelpRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    new-instance v1, Lcom/ibotta/android/routing/area/FeaturedRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    new-instance v1, Lcom/ibotta/android/routing/area/HowToUseIbottaRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/HowToUseIbottaRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v1, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    new-instance v1, Lcom/ibotta/android/routing/area/InternalBrowserRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/InternalBrowserRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v1, Lcom/ibotta/android/routing/area/InviteRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/InviteRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v1, Lcom/ibotta/android/routing/area/NoneRouteArea;

    invoke-direct {v1}, Lcom/ibotta/android/routing/area/NoneRouteArea;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    new-instance v1, Lcom/ibotta/android/routing/area/OSSearchRouteArea;

    invoke-direct {v1, p5}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;-><init>(Lcom/ibotta/android/tracking/Tracker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    new-instance p5, Lcom/ibotta/android/routing/area/MyEarningsRouteArea;

    invoke-direct {p5}, Lcom/ibotta/android/routing/area/MyEarningsRouteArea;-><init>()V

    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance p5, Lcom/ibotta/android/routing/area/RedeemRouteArea;

    invoke-direct {p5}, Lcom/ibotta/android/routing/area/RedeemRouteArea;-><init>()V

    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    new-instance p5, Lcom/ibotta/android/routing/area/AccountRouteArea;

    invoke-direct {p5}, Lcom/ibotta/android/routing/area/AccountRouteArea;-><init>()V

    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance p5, Lcom/ibotta/android/routing/area/SystemRouteArea;

    invoke-direct {p5, p1}, Lcom/ibotta/android/routing/area/SystemRouteArea;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance p1, Lcom/ibotta/android/routing/area/TeammatesRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/TeammatesRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance p1, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    new-instance p1, Lcom/ibotta/android/routing/area/WithdrawRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/WithdrawRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    new-instance p1, Lcom/ibotta/android/routing/area/GameRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/GameRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    new-instance p1, Lcom/ibotta/android/routing/area/FavoritesRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/FavoritesRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    new-instance p1, Lcom/ibotta/android/routing/area/ShareableRouteArea;

    invoke-direct {p1, p2, p3, p4}, Lcom/ibotta/android/routing/area/ShareableRouteArea;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/ActivityLifecycleListener;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    new-instance p1, Lcom/ibotta/android/routing/area/ModuleRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/ModuleRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance p1, Lcom/ibotta/android/routing/area/ContactRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/ContactRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    new-instance p1, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    new-instance p1, Lcom/ibotta/android/routing/area/PwiRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/PwiRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance p1, Lcom/ibotta/android/routing/area/PermissionPrimersRouteArea;

    invoke-direct {p1}, Lcom/ibotta/android/routing/area/PermissionPrimersRouteArea;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    new-instance p1, Lcom/ibotta/android/routing/RouteHandlerImpl;

    invoke-direct {p1, p0, v0}, Lcom/ibotta/android/routing/RouteHandlerImpl;-><init>(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Ljava/util/List;)V

    return-object p1
.end method

.method public static provideRoutePreviewer(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/routing/RoutePreviewer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 124
    new-instance v0, Lcom/ibotta/android/routing/RoutePreviewerImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/RoutePreviewerImpl;-><init>(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)V

    return-object v0
.end method

.method public static provideRoutingUriProcessor(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 140
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/routing/RouteHandler;)V

    return-object v0
.end method

.method public static provideUrlResolver()Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    new-instance v1, Lcom/ibotta/android/routing/urlresolver/SendgridUrlResolver;

    invoke-direct {v1}, Lcom/ibotta/android/routing/urlresolver/SendgridUrlResolver;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    new-instance v1, Lcom/ibotta/android/routing/urlresolver/DefaultUrlResolver;

    invoke-direct {v1}, Lcom/ibotta/android/routing/urlresolver/DefaultUrlResolver;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    new-instance v1, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;

    invoke-direct {v1, v0}, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;-><init>(Ljava/util/List;)V

    return-object v1
.end method
