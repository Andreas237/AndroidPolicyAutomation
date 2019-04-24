.class public Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;
.super Ljava/lang/Object;
.source "RoutingUriProcessorImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;


# static fields
.field private static final REGEX_APP_URI:Ljava/lang/String; = "^ibotta-app://[a-zA-Z0-9].*$"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final routeHandler:Lcom/ibotta/android/routing/RouteHandler;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/routing/RouteHandler;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    return-void
.end method


# virtual methods
.method public getPath(Landroid/net/Uri;)Ljava/lang/String;
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "^ibotta-app://[a-zA-Z0-9].*$"

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 46
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "://"

    const-string v4, ":///"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 47
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 48
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 52
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/Formatting;->getEncodedQueryParams(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getRouteIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessorImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/routing/RouteHandler;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
