.class public Lcom/ibotta/android/routing/DeferredDeepLinkManager;
.super Ljava/lang/Object;
.source "DeferredDeepLinkManager.java"

# interfaces
.implements Lcom/facebook/applinks/AppLinkData$CompletionHandler;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private handled:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/ibotta/android/state/user/auth/AuthManager;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->activity:Landroid/app/Activity;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method

.method private onDeepLinkFetched(Landroid/net/Uri;)V
    .locals 4

    const-string v0, "onDeepLinkFetched: %1$s"

    const/4 v1, 0x1

    .line 47
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Activity is finishing, ignoring deep link."

    .line 50
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 53
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->handled:Z

    if-eqz v0, :cond_1

    const-string p1, "Deep link already processed."

    .line 54
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "User is not logged in. Discarding deep link."

    .line 58
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iput-boolean v1, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->handled:Z

    return-void

    :cond_2
    const-string v0, "Routing to deep link now."

    .line 63
    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    iget-object v2, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->activity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1, v3}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 67
    iput-boolean v1, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->handled:Z

    return-void
.end method


# virtual methods
.method public fetchDeepLink()V
    .locals 2

    const-string v0, "fetchDeepLink"

    const/4 v1, 0x0

    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->activity:Landroid/app/Activity;

    invoke-static {v0, p0}, Lcom/facebook/applinks/AppLinkData;->fetchDeferredAppLinkData(Landroid/content/Context;Lcom/facebook/applinks/AppLinkData$CompletionHandler;)V

    return-void
.end method

.method public onDeferredAppLinkDataFetched(Lcom/facebook/applinks/AppLinkData;)V
    .locals 3

    const-string v0, "Facebook deep link fetched."

    const/4 v1, 0x0

    .line 37
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 38
    invoke-virtual {p1}, Lcom/facebook/applinks/AppLinkData;->getTargetUri()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/applinks/AppLinkData;->getTargetUri()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/DeferredDeepLinkManager;->onDeepLinkFetched(Landroid/net/Uri;)V

    return-void

    :cond_1
    :goto_0
    const-string p1, "Null app link data."

    .line 39
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
