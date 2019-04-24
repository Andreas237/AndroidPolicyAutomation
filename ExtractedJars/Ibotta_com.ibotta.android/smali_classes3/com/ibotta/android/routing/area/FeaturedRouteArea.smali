.class public Lcom/ibotta/android/routing/area/FeaturedRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "FeaturedRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForCategoryGallery(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "category_id"

    .line 55
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 58
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

.method private getIntentForFeatured(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 87
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForFeatured(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 78
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    const-string p1, "search"

    invoke-virtual {p2, p1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->search(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForHomeHot(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 73
    new-instance v0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->forWhatsHot()Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForHomeSeasonal(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 66
    new-instance v0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;-><init>(Landroid/content/Context;)V

    const-string p1, "category_id"

    .line 67
    invoke-virtual {p2, p1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->forSeasonalCategory(I)Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForOfferTagSearch(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    .line 82
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    const-string p1, "offer_tag"

    invoke-virtual {p2, p1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->offerTag(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

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

    .line 92
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/home.*"

    .line 93
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/seasonal/.*"

    .line 94
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/category/.*"

    .line 95
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/category/(?<category_id>\\d+)(/)?(\\?.*)?$"

    .line 35
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 36
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForCategoryGallery(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/seasonal/(?<category_id>\\d+)(/)?(\\?.*)?$"

    .line 37
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForHomeSeasonal(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "^/home/hot(/)?(\\?.*)?$"

    .line 39
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForHomeHot(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "^/home/search/(?<search>.*)$"

    .line 41
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 42
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForFeatured(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "^/home/offer-tag/(?<offer_tag>.*)$"

    .line 43
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 44
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForOfferTagSearch(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "^/home(/)?(\\?.*)?$"

    .line 45
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "^/home/tutorial/upgrade(/)?(\\?.*)?$"

    .line 46
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    return-object p1

    .line 47
    :cond_6
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/FeaturedRouteArea;->getIntentForFeatured(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
