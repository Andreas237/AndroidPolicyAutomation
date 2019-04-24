.class public Lcom/ibotta/android/routing/intent/RoutingIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "RoutingIntentCreator.java"


# instance fields
.field private final clearOffers:Z

.field private clearTask:Z

.field private final routeContext:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask:Z

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->routeContext:Ljava/lang/String;

    .line 26
    iput-boolean p3, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearOffers:Z

    return-void
.end method


# virtual methods
.method public clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask:Z

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 36
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/activity/routing/RoutingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 38
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->routeContext:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "route_context"

    .line 39
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const-string v1, "clear_offers"

    .line 42
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearOffers:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "clear_task"

    .line 43
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method
