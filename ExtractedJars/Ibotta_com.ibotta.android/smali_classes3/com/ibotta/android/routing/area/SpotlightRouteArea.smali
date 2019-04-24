.class public Lcom/ibotta/android/routing/area/SpotlightRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "SpotlightRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForSpotlightWithRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 2

    const-string v0, "retailer_id"

    .line 40
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "offer_ids"

    .line 41
    invoke-virtual {p2, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getIntsArray(Ljava/lang/String;)[I

    move-result-object p2

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 45
    new-instance v1, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-direct {v1, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-virtual {v1, p2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForSpotlightWithoutRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "offer_ids"

    .line 56
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getIntsArray(Ljava/lang/String;)[I

    move-result-object p2

    if-eqz p2, :cond_0

    .line 59
    new-instance v0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
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

    .line 67
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/offer(s)?/.*"

    .line 68
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/retailer(s)?/any/offer/.*"

    .line 69
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/retailer(s)?/(?<retailer_id>\\d+)/offer/.*"

    .line 70
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/offer/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getIntentForSpotlightWithRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/retailer(s)?/any/offer/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

    .line 30
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "^/offer(s)?/(?<offer_ids>\\d+(,\\d+)*)(/)?(\\?.*)?$"

    .line 31
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 32
    :cond_2
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/SpotlightRouteArea;->getIntentForSpotlightWithoutRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
