.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;
.super Ljava/lang/Object;
.source "DebugRoutes.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDebugRoutes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;",
            ">;"
        }
    .end annotation

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Activity"

    const-string v3, "activity"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Activity Team"

    const-string v3, "activity/team"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Category"

    const-string v3, "category:category"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailerCategory()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Cashout"

    const-string v3, "cashout"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Bonuses"

    const-string v3, "bonuses"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Bonus"

    const-string v3, "bonuses/bonus:bonus"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asBonuses()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Browser External"

    const-string v3, "url/https://www.ibotta.com"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Browser Internal"

    const-string v3, "web/https://www.ibotta.com"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Friends"

    const-string v3, "friends"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Gallery"

    const-string v3, "retailer:retailer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Gallery Offer"

    const-string v3, "retailer:retailer/offer:offer/gallery"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Gallery Category"

    const-string v3, "retailer:retailer/category:offer_category"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asCategory()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Gallery Exclusive"

    const-string v3, "retailer:retailer/category/exclusive"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Gallery Exclusives"

    const-string v3, "retailer:retailer/category/exclusives"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Help"

    const-string v3, "help"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Home"

    const-string v3, "home"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Home What\'s New"

    const-string v3, "home/tutorial/upgrade"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Home Tutorial"

    const-string v3, "home/tutorial/new"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "What\'s Hot"

    const-string v3, "home/hot"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Home Seasonal"

    const-string v3, "seasonal:category"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailerCategory()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Recommended"

    const-string v3, "home/recommended"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Search Home One Word"

    const-string v3, "home/search/milk"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Search Home Two Words"

    const-string v3, "home/search/milk dairy"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Global Shopping List"

    const-string v3, "shopping_list"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "How to use Ibotta"

    const-string v3, "howtouse"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Invite"

    const-string v3, "invite"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Ranking"

    const-string v3, "ranking"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Redeem"

    const-string v3, "redeem"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Link Loyalty Card"

    const-string v3, "retailer:retailer/link"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Pending"

    const-string v3, "retailer:retailer/pending"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Shopping List"

    const-string v3, "retailer:retailer/shopping_list"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Search Retailer One Word"

    const-string v3, "retailer:retailer/search/milk"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Search Retailer Two Words"

    const-string v3, "retailer:retailer/search/milk dairy"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Locator"

    const-string v3, "retailer:retailer/locate"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Any, Specific Offer, Spotlight"

    const-string v3, "retailer/any/offer:offer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Retailer Any, Specific Offer, Gallery"

    const-string v3, "retailer/any/offer:offer/gallery"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 59
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "PWI Home"

    const-string v3, "buyable-gift-card/104"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "PWI Retailers List"

    const-string v3, "buyable-gift-card/retailers"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "PWI Wallet Transactions"

    const-string v3, "account/wallet/gift-cards"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "PWI Wallet Payment Methods"

    const-string v3, "account/wallet/payment-methods"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Reward Code"

    const-string v3, "reward_code"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Settings"

    const-string v3, "settings"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Settings Profile"

    const-string v3, "settings/profile"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Settings Social"

    const-string v3, "settings/social"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Settings Facebook"

    const-string v3, "settings/social/facebook"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Spotlight Offer"

    const-string v3, "retailer:retailer/offer:offer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 70
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Spotlight Offer (No Retailer)"

    const-string v3, "offer:offer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Teamwork"

    const-string v3, "teamwork"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Upgrade"

    const-string v3, "upgrade"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlock"

    const-string v3, "unlock:offer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asOffer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals Retailer Rebates"

    const-string v3, "unlocked:retailer/rebates"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals Retailer Discounts"

    const-string v3, "unlocked:retailer/discounts"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    .line 78
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals Retailer"

    const-string v3, "unlocked:retailer"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->asRetailer()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals Rebates"

    const-string v3, "unlocked/any/rebates"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals Discounts"

    const-string v3, "unlocked/any/discounts"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "Unlocked Deals"

    const-string v3, "unlocked/any"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "_(Legacy) Exclusives"

    const-string v3, "exclusives"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "_(Legacy) Gallery"

    const-string v3, "gallery"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "_(Legacy) List"

    const-string v3, "list"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "_(Legacy) Withdraw"

    const-string v3, "withdraw"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;

    const-string v2, "_(Legacy) Stores"

    const-string v3, "stores"

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
