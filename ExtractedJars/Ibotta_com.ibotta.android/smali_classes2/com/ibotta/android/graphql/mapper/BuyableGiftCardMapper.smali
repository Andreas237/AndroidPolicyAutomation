.class public Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "BuyableGiftCardMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;",
        "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RetailerMapper;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 15
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setId(I)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setIdString(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->cache_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setCacheKey(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setLink(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setName(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setSortOrder(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setType(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setTypedId(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setDescription(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->end_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setEndTime(Ljava/util/Date;)V

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->image_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setImageUrl(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->max_purchase_amount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setMaxPurchaseAmount(F)V

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->min_purchase_amount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setMinPurchaseAmount(F)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->pre_configured_denominations()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asFloatSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setPreconfiguredAmounts(Ljava/util/Set;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setRetailerId(I)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 46
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->retailerMapper:Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer;->fragments()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment$Retailer$Fragments;->retailerFragment()Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 48
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->retailer_sku()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setRetailerSku(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->reward_percentage()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setRewardPercentage(F)V

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->start_time()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setStartTime(Ljava/util/Date;)V

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;->terms()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->setTerms(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 9
    check-cast p1, Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    move-result-object p1

    return-object p1
.end method
