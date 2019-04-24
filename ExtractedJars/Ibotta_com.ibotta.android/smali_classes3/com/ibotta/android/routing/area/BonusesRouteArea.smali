.class public Lcom/ibotta/android/routing/area/BonusesRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "BonusesRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForBonuses(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 55
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusesIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/BonusesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/BonusesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForSpecificBonus(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "bonus_ids"

    .line 42
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getIntsArray(Ljava/lang/String;)[I

    move-result-object p2

    if-eqz p2, :cond_1

    .line 43
    array-length v0, p2

    if-lez v0, :cond_1

    .line 44
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    array-length p2, p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
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

    .line 60
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/bonuses.*"

    .line 61
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/bonuses/bonus/(?<bonus_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

    .line 31
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "^/bonuses/(?<bonus_ids>\\d+)/?.*"

    .line 32
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "^/bonuses(/)?(\\?.*)?$"

    .line 34
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getIntentForBonuses(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 33
    :cond_2
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/BonusesRouteArea;->getIntentForSpecificBonus(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
