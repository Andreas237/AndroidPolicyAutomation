.class public Lcom/ibotta/android/routing/area/IbottaWebRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "IbottaWebRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForOfferBonusCombo(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 3

    const-string v0, "offer_id"

    .line 130
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "bonus_id"

    .line 131
    invoke-virtual {p2, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 134
    new-instance v1, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-direct {v1, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    const/4 v2, 0x0

    .line 135
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, p1, v2

    invoke-virtual {v1, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    .line 136
    invoke-virtual {p1, p2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->relatedBonusId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForWebCategoryId(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "category_id"

    .line 114
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 117
    new-instance v0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForWebHomeSearch(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "q"

    .line 125
    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 126
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->search(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForWebOfferAtAnyRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "offer_ids"

    .line 79
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntsArray(Ljava/lang/String;)[I

    move-result-object p2

    .line 81
    new-instance v0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForWebRetailer(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer"

    .line 86
    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 89
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 90
    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setDasherizedName(Ljava/lang/String;)V

    .line 92
    new-instance p2, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForWebRetailerAndOffer(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer"

    .line 63
    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 67
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 68
    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setDasherizedName(Ljava/lang/String;)V

    .line 70
    new-instance p2, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForWebRetailerId(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer_id"

    .line 100
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 103
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 104
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 106
    new-instance p2, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

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

    .line 145
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/rebate(s)?((?!os_search).)*$"

    .line 146
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/rebates/(?<offer_id>\\d+)/.*/bonuses/(?<bonus_id>\\d+)/.*/?.*$"

    .line 39
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 40
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForOfferBonusCombo(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/rebate(s)?/(?<offer_ids>\\d+)/.*\\?.*retailer=.*$"

    .line 41
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebRetailerAndOffer(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "^/rebate(s)?/(?<offer_ids>\\d+).*"

    .line 43
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 44
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebOfferAtAnyRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "^/rebate(s)?\\?.*retailer=.*"

    .line 45
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebRetailer(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "^/rebate(s)?(/)?\\?.*(&)?q=.*"

    .line 47
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebHomeSearch(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "^/rebates/translate/retailer/(?<retailer_id>\\d+).*"

    .line 49
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebRetailerId(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v0, "^/rebates/translate/category/(?<category_id>\\d+).*"

    .line 51
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/IbottaWebRouteArea;->getIntentForWebCategoryId(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 54
    :cond_6
    new-instance p2, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
