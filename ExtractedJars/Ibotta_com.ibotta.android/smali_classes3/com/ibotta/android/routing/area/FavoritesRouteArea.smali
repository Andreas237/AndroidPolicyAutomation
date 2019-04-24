.class public Lcom/ibotta/android/routing/area/FavoritesRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "FavoritesRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method


# virtual methods
.method protected getAreaRegexes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/favorites.*"

    .line 34
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/favorites(/)?(\\?.*)?$"

    .line 24
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FavoritesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 25
    new-instance p2, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/FavoritesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
