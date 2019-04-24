.class public Lcom/ibotta/android/routing/area/OSSearchRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "OSSearchRouteArea.java"


# instance fields
.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method

.method private getIntentForOsSearchRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 3

    const-string v0, "retailer_id"

    .line 47
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "os_search_retailer_view"

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;I)V

    .line 52
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 53
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 55
    new-instance p2, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForOsSearchRetailerAnyOffer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "offer_ids"

    .line 64
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getIntsArray(Ljava/lang/String;)[I

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 66
    array-length v1, p2

    if-lez v1, :cond_0

    aget v0, p2, v0

    .line 67
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v2, "os_search_offer_view"

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;I)V

    .line 69
    new-instance v0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

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

    .line 74
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/retailer(s)?/(\\d+)/os_search.*"

    .line 75
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/rebate(s)?/(\\d+)/os_search.*"

    .line 76
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/os_search(/)?(\\?.*)?$"

    .line 36
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getIntentForOsSearchRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/rebate(s)?/(?<offer_ids>\\d+)/os_search(/)?(\\?.*)?$"

    .line 38
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/OSSearchRouteArea;->getIntentForOsSearchRetailerAnyOffer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
