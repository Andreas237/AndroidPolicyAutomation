.class public Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerUnlockCodesResponse.java"


# static fields
.field public static final KEY_EXCLUDED_BONUS_IDS:Ljava/lang/String; = "excluded_bonus_ids"

.field public static final KEY_EXCLUDED_FEATURE_IDS:Ljava/lang/String; = "excluded_feature_ids"

.field public static final KEY_EXCLUDED_OFFER_IDS:Ljava/lang/String; = "excluded_offer_ids"

.field public static final KEY_OFFERS:Ljava/lang/String; = "offers"

.field public static final KEY_OFFER_PRODUCTS:Ljava/lang/String; = "offer_products"

.field public static final KEY_UNLOCKED_BONUSES:Ljava/lang/String; = "unlocked_bonuses"

.field public static final KEY_UNLOCKED_OFFERS:Ljava/lang/String; = "unlocked_offers"


# instance fields
.field private excludedBonusIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private excludedFeatureIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private excludedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private offerProducts:Lcom/fasterxml/jackson/databind/JsonNode;

.field private unlockedBonuses:Lcom/fasterxml/jackson/databind/JsonNode;

.field private unlockedOffers:Lcom/fasterxml/jackson/databind/JsonNode;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedOfferIds:Ljava/util/Set;

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedBonusIds:Ljava/util/Set;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedFeatureIds:Ljava/util/Set;

    return-void
.end method

.method public static create(Lcom/ibotta/android/json/IbottaJson;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;
    .locals 7

    .line 30
    new-instance v0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;-><init>()V

    const-string v1, "unlocked_offers"

    .line 31
    invoke-static {p1, v1}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->getSafely(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "unlocked_bonuses"

    .line 32
    invoke-static {p1, v2}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->getSafely(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    const-string v3, "offer_products"

    .line 33
    invoke-static {p1, v3}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->getSafely(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    const-string v4, "excluded_offer_ids"

    .line 35
    invoke-static {v4, p0, p1}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->toIntegerSet(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJson;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;

    move-result-object v4

    const-string v5, "excluded_feature_ids"

    .line 36
    invoke-static {v5, p0, p1}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->toIntegerSet(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJson;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;

    move-result-object v5

    const-string v6, "excluded_bonus_ids"

    .line 37
    invoke-static {v6, p0, p1}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->toIntegerSet(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJson;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;

    move-result-object p0

    .line 39
    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setUnlockedOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 40
    invoke-virtual {v0, v4}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setExcludedOfferIds(Ljava/util/Set;)V

    .line 41
    invoke-virtual {v0, v2}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setUnlockedBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 42
    invoke-virtual {v0, p0}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setExcludedBonusIds(Ljava/util/Set;)V

    .line 43
    invoke-virtual {v0, v3}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setOfferProducts(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 44
    invoke-virtual {v0, v5}, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->setExcludedFeatureIds(Ljava/util/Set;)V

    return-object v0
.end method

.method private static getSafely(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 50
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static toIntegerSet(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJson;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 122
    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0

    .line 129
    :cond_0
    :try_start_0
    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object p0

    const-class p2, Ljava/lang/Integer;

    invoke-interface {p1, p0, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashSet(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/HashSet;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 131
    :catch_0
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public getExcludedBonusIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedBonusIds:Ljava/util/Set;

    return-object v0
.end method

.method public getExcludedFeatureIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedFeatureIds:Ljava/util/Set;

    return-object v0
.end method

.method public getExcludedOfferIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedOfferIds:Ljava/util/Set;

    return-object v0
.end method

.method public getOfferProducts()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->offerProducts:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getUnlockedBonuses()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedBonuses:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getUnlockedOfferIds()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    if-eqz v0, :cond_2

    const-string v1, "offers"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    const-string v1, "offers"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 107
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 109
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fieldNames()Ljava/util/Iterator;

    move-result-object v0

    .line 110
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 112
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_1
    return-object v1

    .line 103
    :cond_2
    :goto_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getUnlockedOffers()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public setExcludedBonusIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedBonusIds:Ljava/util/Set;

    return-void
.end method

.method public setExcludedFeatureIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedFeatureIds:Ljava/util/Set;

    return-void
.end method

.method public setExcludedOfferIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 66
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->excludedOfferIds:Ljava/util/Set;

    return-void
.end method

.method public setOfferProducts(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->offerProducts:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setUnlockedBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedBonuses:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setUnlockedOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerUnlockCodesResponse;->unlockedOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method
