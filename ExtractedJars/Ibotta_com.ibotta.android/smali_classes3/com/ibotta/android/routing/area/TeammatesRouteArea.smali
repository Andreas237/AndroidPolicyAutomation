.class public Lcom/ibotta/android/routing/area/TeammatesRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "TeammatesRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
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

    .line 35
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/teamwork.*"

    .line 36
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/friends.*"

    .line 37
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/teamwork(/)?(\\?.*)?$"

    .line 26
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/TeammatesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "^/friends(/)?(\\?.*)?$"

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/TeammatesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_1
    :goto_0
    new-instance p2, Lcom/ibotta/android/routing/intent/TeammatesIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/TeammatesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/TeammatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method