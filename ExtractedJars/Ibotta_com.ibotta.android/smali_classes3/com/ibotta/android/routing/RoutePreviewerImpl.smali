.class public Lcom/ibotta/android/routing/RoutePreviewerImpl;
.super Ljava/lang/Object;
.source "RoutePreviewerImpl.java"

# interfaces
.implements Lcom/ibotta/android/routing/RoutePreviewer;


# instance fields
.field private final routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

.field private final routeHandler:Lcom/ibotta/android/routing/RouteHandler;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    return-void
.end method


# virtual methods
.method protected getRouteHandler()Lcom/ibotta/android/routing/RouteHandler;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    return-object v0
.end method

.method public isCacheClear(Ljava/lang/String;)Z
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->cleanUp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 45
    const-class v0, Lcom/ibotta/android/routing/area/CacheRouteArea;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/routing/RoutePreviewerImpl;->isRouteForRouteArea(Ljava/lang/String;Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public isFeaturedSearch(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->cleanUp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 68
    const-class v0, Lcom/ibotta/android/routing/area/FeaturedRouteArea;

    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/routing/RoutePreviewerImpl;->isRouteForRouteArea(Ljava/lang/String;Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 72
    iget-object v2, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {v2, p1, p2}, Lcom/ibotta/android/routing/RouteHandler;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "search_param"

    .line 74
    invoke-virtual {p1, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isGallery(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->cleanUp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 52
    const-class v0, Lcom/ibotta/android/routing/area/GalleryRouteArea;

    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/routing/RoutePreviewerImpl;->isRouteForRouteArea(Ljava/lang/String;Ljava/lang/Class;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 56
    iget-object v2, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {v2, p1, p2}, Lcom/ibotta/android/routing/RouteHandler;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 58
    const-class p2, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isNoOp(Ljava/lang/String;)Z
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->cleanUp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    const-class v0, Lcom/ibotta/android/routing/area/NoneRouteArea;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/routing/RoutePreviewerImpl;->isRouteForRouteArea(Ljava/lang/String;Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method protected isRouteForRouteArea(Ljava/lang/String;Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/routing/area/RouteArea;",
            ">;)Z"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/routing/RoutePreviewerImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {v0, p1}, Lcom/ibotta/android/routing/RouteHandler;->getRouteArea(Ljava/lang/String;)Lcom/ibotta/android/routing/area/RouteArea;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
