.class public final Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;
.super Ljava/lang/Object;
.source "RoutingActivity_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/activity/routing/RoutingActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final lifecycleTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final routeCleanerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;"
        }
    .end annotation
.end field

.field private final routePreviewerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
            ">;"
        }
    .end annotation
.end field

.field private final routingUriProcessorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;"
        }
    .end annotation
.end field

.field private final urlResolverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;",
            ">;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routeCleanerProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p2, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->urlResolverProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p3, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->lifecycleTrackerProvider:Ljavax/inject/Provider;

    .line 56
    iput-object p4, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routePreviewerProvider:Ljavax/inject/Provider;

    .line 57
    iput-object p5, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->appCacheProvider:Ljavax/inject/Provider;

    .line 58
    iput-object p6, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    .line 59
    iput-object p7, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 60
    iput-object p8, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    .line 61
    iput-object p9, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    .line 62
    iput-object p10, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routingUriProcessorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/sdk/LifecycleTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RoutePreviewer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/activity/routing/RoutingActivity;",
            ">;"
        }
    .end annotation

    .line 76
    new-instance v11, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v11
.end method

.method public static injectAppCache(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/appcache/AppCache;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appCache:Lcom/ibotta/android/appcache/AppCache;

    return-void
.end method

.method public static injectAppHelper(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectAuthManager(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method

.method public static injectLifecycleTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    return-void
.end method

.method public static injectRouteCleaner(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/cleaner/RouteCleaner;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    return-void
.end method

.method public static injectRoutePreviewer(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    return-void
.end method

.method public static injectRoutingUriProcessor(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routingUriProcessor:Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    return-void
.end method

.method public static injectTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method

.method public static injectTrackingQueue(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method public static injectUrlResolver(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/urlresolver/UrlResolver;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->urlResolver:Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/activity/routing/RoutingActivity;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routeCleanerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRouteCleaner(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/cleaner/RouteCleaner;)V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->urlResolverProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectUrlResolver(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/urlresolver/UrlResolver;)V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->lifecycleTrackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectLifecycleTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routePreviewerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRoutePreviewer(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/RoutePreviewer;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->appCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAppCache(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/appcache/AppCache;)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectTracker(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/Tracker;)V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAppHelper(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/util/AppHelper;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->authManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectAuthManager(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/state/user/auth/AuthManager;)V

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->routingUriProcessorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    invoke-static {p1, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectRoutingUriProcessor(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/activity/routing/RoutingActivity;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity_MembersInjector;->injectMembers(Lcom/ibotta/android/activity/routing/RoutingActivity;)V

    return-void
.end method
