.class public Lcom/ibotta/android/routing/area/GalleryRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "GalleryRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForButtonSdkReturn(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 55
    new-instance v0, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/FeaturedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForGalleryAndCategory(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 2

    const-string v0, "retailer_id"

    .line 60
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "category_id"

    .line 61
    invoke-virtual {p2, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz v0, :cond_0

    .line 64
    new-instance v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 65
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 66
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 67
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId(I)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForGalleryLinkCard(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer_id"

    .line 91
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 94
    new-instance v0, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForGallerySearch(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 2

    const-string v0, "retailer_id"

    .line 75
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "search_jump"

    .line 78
    invoke-virtual {p2, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 79
    new-instance v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 82
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 83
    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForGalleryWithRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer_id"

    .line 112
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 115
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 116
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 117
    new-instance p2, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getIntentForStoreLocator(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer_id"

    .line 101
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 104
    new-instance v0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method protected createRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 131
    new-instance v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    return-object v0
.end method

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

    .line 125
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/retailer(s)?((?!os_search).)*$"

    .line 126
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/retailer(s)?/(\\d+)/transactions\\?date=(\\d+)$"

    .line 36
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForButtonSdkReturn(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/category/(?<category_id>\\d+)(/)?(\\?.*)?$"

    .line 38
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 39
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForGalleryAndCategory(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/search/(?<search_jump>.*)$"

    .line 40
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 41
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForGallerySearch(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/link(/)?(\\?.*)?$"

    .line 42
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 43
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForGalleryLinkCard(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)/locate(/)?(\\?.*)?$"

    .line 44
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 45
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForStoreLocator(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "^/retailer(s)?/(?<retailer_id>\\d+)(/(?<gallery_tab>rebates|discounts))?(/)?(\\?.*)?$"

    .line 46
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/GalleryRouteArea;->getIntentForGalleryWithRetailer(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method
