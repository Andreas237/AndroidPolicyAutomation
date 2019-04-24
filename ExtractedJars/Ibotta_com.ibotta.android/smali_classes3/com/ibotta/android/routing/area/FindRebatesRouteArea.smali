.class public Lcom/ibotta/android/routing/area/FindRebatesRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "FindRebatesRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method


# virtual methods
.method protected getAreaRegexes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "^/retailer(s)?/category.*"

    .line 36
    invoke-static {v0}, Ljava9/util/Sets;->of(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/retailer(s)?/category?(/)?(\\?.*)?$"

    .line 25
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FindRebatesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 26
    new-instance p2, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
