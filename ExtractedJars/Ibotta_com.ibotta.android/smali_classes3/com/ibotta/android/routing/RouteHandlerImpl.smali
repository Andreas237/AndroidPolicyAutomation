.class public Lcom/ibotta/android/routing/RouteHandlerImpl;
.super Ljava/lang/Object;
.source "RouteHandlerImpl.java"

# interfaces
.implements Lcom/ibotta/android/routing/RouteHandler;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final routeAreas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/routing/area/RouteArea;",
            ">;"
        }
    .end annotation
.end field

.field private final routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/routing/area/RouteArea;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    if-eqz p2, :cond_0

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeAreas:Ljava/util/List;

    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeAreas:Ljava/util/List;

    :goto_0
    return-void
.end method


# virtual methods
.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 41
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeCleaner:Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->cleanUp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 47
    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/RouteHandlerImpl;->getRouteArea(Ljava/lang/String;)Lcom/ibotta/android/routing/area/RouteArea;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/routing/area/RouteArea;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getRouteArea(Ljava/lang/String;)Lcom/ibotta/android/routing/area/RouteArea;
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeAreas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/routing/area/RouteArea;

    .line 56
    invoke-interface {v1, p1}, Lcom/ibotta/android/routing/area/RouteArea;->isResponsibleFor(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method protected getRouteAreas()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/routing/area/RouteArea;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/routing/RouteHandlerImpl;->routeAreas:Ljava/util/List;

    return-object v0
.end method
