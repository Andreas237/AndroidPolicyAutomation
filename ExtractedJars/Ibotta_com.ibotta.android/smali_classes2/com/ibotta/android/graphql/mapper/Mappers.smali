.class public Lcom/ibotta/android/graphql/mapper/Mappers;
.super Ljava/lang/Object;
.source "Mappers.java"


# static fields
.field private static final DISPLAY_TYPE_GRID_MODULE:Ljava/lang/String; = "grid"

.field private static final DISPLAY_TYPE_RETAILER_MODULE:Ljava/lang/String; = "boxed"

.field private static final TYPE_BONUS:Ljava/lang/String; = "Bonus"

.field private static final TYPE_CATEGORY:Ljava/lang/String; = "Category"

.field private static final TYPE_DEAL:Ljava/lang/String; = "Deal"

.field private static final TYPE_FEATURE:Ljava/lang/String; = "Feature"

.field private static final TYPE_FEATURED_RETAILER:Ljava/lang/String; = "FeaturedRetailer"

.field private static final TYPE_OFFER:Ljava/lang/String; = "Offer"

.field private static final TYPE_PRODUCT:Ljava/lang/String; = "Product"

.field private static final TYPE_QUEST:Ljava/lang/String; = "Quest"

.field private static final TYPE_RETAILER:Ljava/lang/String; = "Retailer"


# instance fields
.field private final bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

.field private final buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

.field private final buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

.field private final customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

.field private final dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;

.field private final engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

.field private final featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

.field private final moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

.field private final offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

.field private final offerCategoryWithReferencesMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

.field private final offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

.field private final productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

.field private final retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

.field private final retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/mapper/RetailerMapper;Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/mapper/BonusMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/ModuleMapper;Lcom/ibotta/android/graphql/mapper/ProductMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;Lcom/ibotta/android/graphql/mapper/DealMapper;Lcom/ibotta/android/graphql/mapper/EngagementMapper;Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    .line 98
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    .line 99
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    .line 100
    iput-object p4, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    .line 101
    iput-object p5, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerCategoryWithReferencesMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    .line 102
    iput-object p6, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 103
    iput-object p7, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    .line 104
    iput-object p8, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

    .line 105
    iput-object p9, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    .line 106
    iput-object p10, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    .line 107
    iput-object p11, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;

    .line 108
    iput-object p12, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    .line 109
    iput-object p13, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    .line 110
    iput-object p14, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    return-void
.end method

.method public static isBonusType(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Bonus"

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isCategory(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Category"

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isDeal(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Deal"

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isFeature(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Feature"

    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isFeaturedRetailer(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "FeaturedRetailer"

    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isGridModuleDisplayType(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "grid"

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isOfferType(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Offer"

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isProduct(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Product"

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isQuest(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Quest"

    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isRetailerModuleDisplayType(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "boxed"

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isRetailerType(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Retailer"

    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isSimpleModuleDisplayType(Ljava/lang/String;)Z
    .locals 0

    .line 43
    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isRetailerModuleDisplayType(Ljava/lang/String;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public getBonusMapper()Lcom/ibotta/android/graphql/mapper/BonusMapper;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->bonusMapper:Lcom/ibotta/android/graphql/mapper/BonusMapper;

    return-object v0
.end method

.method public getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    return-object v0
.end method

.method public getBuyableGiftCardRetailerMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    return-object v0
.end method

.method public getCustomerNodeMapper()Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->customerNodeMapper:Lcom/ibotta/android/graphql/mapper/CustomerNodeMapper;

    return-object v0
.end method

.method public getDealMapper()Lcom/ibotta/android/graphql/mapper/DealMapper;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->dealMapper:Lcom/ibotta/android/graphql/mapper/DealMapper;

    return-object v0
.end method

.method public getEngagementMapper()Lcom/ibotta/android/graphql/mapper/EngagementMapper;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->engagementMapper:Lcom/ibotta/android/graphql/mapper/EngagementMapper;

    return-object v0
.end method

.method public getFeatureMapper()Lcom/ibotta/android/graphql/mapper/FeatureMapper;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    return-object v0
.end method

.method public getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    return-object v0
.end method

.method public getOfferCategoryMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerCategoryMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryMapper;

    return-object v0
.end method

.method public getOfferCategoryWithReferencesMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerCategoryWithReferencesMapper:Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    return-object v0
.end method

.method public getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->offerMapper:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    return-object v0
.end method

.method public getProductMapper()Lcom/ibotta/android/graphql/mapper/ProductMapper;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->productMapper:Lcom/ibotta/android/graphql/mapper/ProductMapper;

    return-object v0
.end method

.method public getRetailerCategoryNodeMapper()Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->retailerCategoryNodeMapper:Lcom/ibotta/android/graphql/mapper/RetailerCategoryNodeMapper;

    return-object v0
.end method

.method public getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/Mappers;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    return-object v0
.end method
