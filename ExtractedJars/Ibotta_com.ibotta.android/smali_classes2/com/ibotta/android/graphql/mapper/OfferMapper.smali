.class public Lcom/ibotta/android/graphql/mapper/OfferMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "OfferMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/OfferFragment;",
        "Lcom/ibotta/api/model/content/OfferContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final availableAtRetailerMapper:Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

.field private final buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

.field private final productGroupMapper:Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

.field private final rewardMapper:Lcom/ibotta/android/graphql/mapper/RewardMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/RewardMapper;Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->rewardMapper:Lcom/ibotta/android/graphql/mapper/RewardMapper;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->productGroupMapper:Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    .line 43
    iput-object p5, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->availableAtRetailerMapper:Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

    return-void
.end method

.method public static synthetic lambda$map$0(Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;)Lcom/ibotta/api/model/offer/ProductGroup;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->productGroupMapper:Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;->fragments()Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group$Fragments;->productGroupFragment()Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/ProductGroupMapper;->map(Lcom/ibotta/android/graphql/fragment/ProductGroupFragment;)Lcom/ibotta/api/model/offer/ProductGroup;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$map$1(Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;)Lcom/ibotta/api/model/content/RewardContent;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->rewardMapper:Lcom/ibotta/android/graphql/mapper/RewardMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward;->fragments()Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Reward$Fragments;->rewardFragment()Lcom/ibotta/android/graphql/fragment/RewardFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RewardMapper;->map(Lcom/ibotta/android/graphql/fragment/RewardFragment;)Lcom/ibotta/api/model/content/RewardContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 52
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/OfferContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/OfferContent;-><init>()V

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setId(I)V

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setIdString(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setAbout(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->about_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setAboutTitle(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->activated()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setActivated(Z)V

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->alternate_text()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setAlternateText(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->amount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setAmount(F)V

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->block_customer_submitted_upcs()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setBlockCustomerSubmittedUpcs(Z)V

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->caption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setCaption(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->combo()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setCombo(Z)V

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->current_value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setCurrentValue(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setDescription(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setExpiration(Ljava/util/Date;)V

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->expiring_soon()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setExpiringSoon(Z)V

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hide_available_at()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setHideAvailableAt(Z)V

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->ignore_barcode()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setIgnoreBarcode(Z)V

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->large_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setLargeUrl(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->thumb_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setThumbUrl(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->legal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setLegal(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->liked()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setLiked(Z)V

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setLink(Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples_count()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asShort(Ljava/lang/Number;)S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setMultiplesCount(S)V

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setName(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->new_flag()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setNewFlag(Z)V

    .line 80
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setNonItem(Z)V

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->non_item_total()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setNonItemTotal(F)V

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_group_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setOfferGroupId(Ljava/lang/Integer;)V

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_segment_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setOfferSegmentId(I)V

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->offer_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setOfferType(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->old_value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setOldValue(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->percent_back()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setPercentBack(Ljava/lang/Float;)V

    .line 88
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->preselect()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setPreselect(Z)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->purchase_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setPurchaseType(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->self_funded()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setSelfFunded(Z)V

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->share_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setShareUrl(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setSortOrder(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->terms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setTerms(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setUrl(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->variable_percent_back()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setVariablePercentBack(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->verified()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setVerified(Z)V

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->multiples()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setMultiples(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setRandomWeight(Z)V

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->random_weight_total()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asFloat(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setRandomWeightTotal(F)V

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->redemption_max()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asShort(Ljava/lang/Number;)S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setRedemptionMax(S)V

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->segment_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setSegmentId(I)V

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->total_likes()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asLong(Ljava/lang/Number;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/content/OfferContent;->setTotalLikes(J)V

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setType(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setTypedId(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 110
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->bonuses()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setBonusIds(Ljava/util/Set;)V

    .line 113
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->button_info_map()Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 115
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map;->fragments()Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/OfferFragment$Button_info_map$Fragments;->buttonInfoFragment()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;->map(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V

    .line 118
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 119
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->categories()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setCategoryIds(Ljava/util/Set;)V

    .line 138
    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->products()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 140
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/content/OfferContent;->setProducts(Ljava/util/Set;)V

    .line 143
    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->product_groups()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 145
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$A-O5b7Seyh_HIFar5ODAQ5ZbJCs;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$A-O5b7Seyh_HIFar5ODAQ5ZbJCs;-><init>(Lcom/ibotta/android/graphql/mapper/OfferMapper;)V

    .line 146
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 147
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 145
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setProductGroups(Ljava/util/List;)V

    .line 155
    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 156
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->retailers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setRetailers(Ljava/util/Set;)V

    .line 159
    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->rewards()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 161
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$6MTTjyFa2dUb5Wsul07EQta1YQo;

    invoke-direct {v2, p0}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$6MTTjyFa2dUb5Wsul07EQta1YQo;-><init>(Lcom/ibotta/android/graphql/mapper/OfferMapper;)V

    .line 162
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 163
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 161
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/OfferContent;->setRewards(Ljava/util/List;)V

    .line 168
    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->available_at()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 170
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/graphql/mapper/OfferMapper;->availableAtRetailerMapper:Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/mapper/-$$Lambda$_TT3lECLi2fjJ6U7cfWLMYYSIFw;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$_TT3lECLi2fjJ6U7cfWLMYYSIFw;-><init>(Lcom/ibotta/android/graphql/mapper/AvailableAtRetailerMapper;)V

    .line 171
    invoke-interface {p1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 172
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 170
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/OfferContent;->setAvailableAtRetailers(Ljava/util/List;)V

    :cond_8
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

    .line 27
    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object p1

    return-object p1
.end method
