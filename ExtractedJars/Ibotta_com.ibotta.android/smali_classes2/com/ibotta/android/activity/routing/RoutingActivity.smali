.class public Lcom/ibotta/android/activity/routing/RoutingActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "RoutingActivity.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final IBOTTA_DOMAIN:Ljava/lang/String; = "ibotta.com"

.field public static final LIFEREWARDED_IBOTTA_DOMAIN:Ljava/lang/String; = "liferewarded.ibotta.com"


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field appCache:Lcom/ibotta/android/appcache/AppCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field authManager:Lcom/ibotta/android/state/user/auth/AuthManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llLoader:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090313
    .end annotation
.end field

.field routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field routingUriProcessor:Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvLoadingMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090541
    .end annotation
.end field

.field urlResolver:Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private ensureUri(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    if-nez p1, :cond_1

    .line 334
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "route_context"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 335
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "route"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->ensureIbottaScheme(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    .line 339
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "route"

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->ensureIbottaScheme(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private getFeaturedIntent()Landroid/content/Intent;
    .locals 1

    .line 308
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method private getRouteContext(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routingUriProcessor:Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;->getPath(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    .line 350
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "route_context"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    return-object p1
.end method

.method private handleUrlResolvedExternally(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V
    .locals 3

    const-string v0, "Open resolved URL in browser"

    const/4 v1, 0x0

    .line 187
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-virtual {p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->getUri()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->getUri()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->openExternalUri(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Sendgrid resolved URL was NULL"

    .line 192
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->launchHome()V

    :goto_0
    return-void
.end method

.method private handleUrlResolvedInternally(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V
    .locals 2

    const-string v0, "Open resolved URL in app using routes"

    const/4 v1, 0x0

    .line 169
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->setIntent(Landroid/content/Intent;)V

    .line 175
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->getUri()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 178
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->routeUser()V

    return-void
.end method

.method public static synthetic lambda$V3SHVLl-LNY0e9J7jHIv-0vbvIk(Lcom/ibotta/android/activity/routing/RoutingActivity;Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->onUrlResolved(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V

    return-void
.end method

.method private launchHome()V
    .locals 1

    const/4 v0, 0x0

    .line 270
    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->launchRoute(Landroid/content/Intent;)V

    return-void
.end method

.method private launchRoute(Landroid/content/Intent;)V
    .locals 4
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 275
    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->makeAppsFlyerCompatible(Landroid/content/Intent;)V

    .line 277
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "clear_task"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 279
    invoke-static {}, Lcom/ibotta/android/LocalBroadcast;->broadcastClearNonRoots()V

    .line 285
    :cond_0
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 286
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->isTaskRoot()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 287
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getFeaturedIntent()Landroid/content/Intent;

    move-result-object v2

    .line 288
    invoke-direct {p0, v2}, Lcom/ibotta/android/activity/routing/RoutingActivity;->makeAppsFlyerCompatible(Landroid/content/Intent;)V

    .line 290
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    new-array v2, v0, [Landroid/content/Intent;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->startActivities([Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to start activity, starting home: %1$s"

    .line 296
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 298
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getFeaturedIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const-string p1, "Failed to find route, starting Home."

    .line 301
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getFeaturedIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method private makeAppsFlyerCompatible(Landroid/content/Intent;)V
    .locals 1

    .line 324
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    .line 325
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 327
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "android.intent.action.VIEW"

    .line 328
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method private onUrlResolved(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V
    .locals 1

    if-nez p1, :cond_0

    .line 148
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->launchHome()V

    return-void

    .line 152
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->getUri()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->trackResolvedDeeplink(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->isInternalRoute()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->handleUrlResolvedInternally(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V

    goto :goto_0

    .line 159
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->handleUrlResolvedExternally(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V

    :goto_0
    return-void
.end method

.method private openExternalUri(Ljava/lang/String;)V
    .locals 3

    .line 365
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, p0, v1, v2}, Lcom/ibotta/android/util/AppHelper;->openUriExternally(Landroid/app/Activity;Landroid/net/Uri;Z)V
    :try_end_0
    .catch Lcom/ibotta/android/util/NoSuitableIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 368
    :catch_0
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method private processResolveableRoute(Lcom/ibotta/android/routing/urlresolver/UrlResolver;)V
    .locals 2

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->showUrlResolverLoading()V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/activity/routing/-$$Lambda$RoutingActivity$V3SHVLl-LNY0e9J7jHIv-0vbvIk;

    invoke-direct {v1, p0}, Lcom/ibotta/android/activity/routing/-$$Lambda$RoutingActivity$V3SHVLl-LNY0e9J7jHIv-0vbvIk;-><init>(Lcom/ibotta/android/activity/routing/RoutingActivity;)V

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/routing/urlresolver/UrlResolver;->resolve(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-void
.end method

.method private processRoute(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "User is not logged in. Finishing activity."

    .line 221
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->finish()V

    .line 224
    new-instance p1, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;

    invoke-direct {p1, p0, v1}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/LaunchIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 234
    iget-object v2, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2, p2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-interface {v0, p2}, Lcom/ibotta/android/routing/RoutePreviewer;->isNoOp(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "No-op route."

    .line 237
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->finish()V

    return-void

    .line 240
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-interface {v0, p2}, Lcom/ibotta/android/routing/RoutePreviewer;->isCacheClear(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Clearing Ibotta cache."

    .line 241
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->appCache:Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {v0}, Lcom/ibotta/android/appcache/AppCache;->removeAll()V

    .line 245
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->routingUriProcessor:Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;

    invoke-interface {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;->getRouteIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    :cond_3
    if-nez v0, :cond_5

    if-eqz p1, :cond_5

    .line 248
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "ibotta.com"

    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 249
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "liferewarded.ibotta.com"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "%s uri detected. Routing to internal browser"

    const/4 v0, 0x1

    .line 251
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "liferewarded.ibotta.com"

    aput-object v2, v0, v1

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    new-instance p2, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {p2, p0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    .line 253
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    .line 254
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 252
    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->launchRoute(Landroid/content/Intent;)V

    goto :goto_0

    .line 259
    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->openExternalUri(Ljava/lang/String;)V

    goto :goto_0

    .line 263
    :cond_5
    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->launchRoute(Landroid/content/Intent;)V

    .line 266
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->finish()V

    return-void
.end method

.method private processStandardDeeplinkRoute()V
    .locals 5

    .line 124
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->trackOpenReferrer()V

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->ensureUri(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    .line 129
    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getRouteContext(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Routing for: %1$s"

    const/4 v3, 0x1

    .line 131
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_0

    .line 134
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v3, Lcom/ibotta/android/activity/routing/IllegalRouteException;

    const-string v4, "URI is null cannot resolve route"

    invoke-direct {v3, v4}, Lcom/ibotta/android/activity/routing/IllegalRouteException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 138
    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->processRoute(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method private routeUser()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->urlResolver:Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    invoke-virtual {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/routing/urlresolver/UrlResolver;->isResolveable(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->urlResolver:Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    invoke-direct {p0, v0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->processResolveableRoute(Lcom/ibotta/android/routing/urlresolver/UrlResolver;)V

    goto :goto_0

    .line 105
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->processStandardDeeplinkRoute()V

    :goto_0
    return-void
.end method

.method private showUrlResolverLoading()V
    .locals 2

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->tvLoadingMessage:Landroid/widget/TextView;

    const v1, 0x7f1101a7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->llLoader:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private trackOpenReferrer()V
    .locals 2

    const-string v0, "Tracking open referrer"

    const/4 v1, 0x0

    .line 208
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    invoke-interface {v0, p0}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V

    return-void
.end method

.method private trackResolvedDeeplink(Ljava/lang/String;)V
    .locals 2

    .line 199
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;-><init>()V

    .line 200
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NONE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 201
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;->setReferrer(Ljava/lang/String;)V

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 204
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->trackOpenReferrer()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "RoutingActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/activity/routing/RoutingActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "RoutingActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "RoutingActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "onCreate"

    const/4 v0, 0x0

    .line 79
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/activity/routing/RoutingActivity;)V

    const p1, 0x7f0c0067

    .line 83
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->setContentView(I)V

    .line 84
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    .line 86
    invoke-direct {p0}, Lcom/ibotta/android/activity/routing/RoutingActivity;->routeUser()V

    .line 87
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "onNewIntent"

    const/4 v1, 0x0

    .line 71
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 73
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/routing/RoutingActivity;->setIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    return-void
.end method
