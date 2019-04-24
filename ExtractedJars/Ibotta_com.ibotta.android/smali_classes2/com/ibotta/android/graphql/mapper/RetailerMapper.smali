.class public Lcom/ibotta/android/graphql/mapper/RetailerMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerFragment;",
        "Lcom/ibotta/api/model/content/RetailerContent;",
        ">;"
    }
.end annotation


# instance fields
.field private final buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

.field private final featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

.field private final retailerBarcodeConfigurationMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

.field private final retailerRedemptionMetaMapper:Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

.field private final sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;Lcom/ibotta/android/graphql/mapper/FeatureMapper;Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;Lcom/ibotta/android/graphql/mapper/SortResultMapper;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->retailerBarcodeConfigurationMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    .line 42
    iput-object p5, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->retailerRedemptionMetaMapper:Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    .line 43
    iput-object p6, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    return-void
.end method

.method static synthetic lambda$map$0(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Ljava/util/HashSet;
    .locals 1

    .line 100
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 5
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerFragment;
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
    new-instance v0, Lcom/ibotta/api/model/content/RetailerContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/RetailerContent;-><init>()V

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setId(I)V

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setIdString(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->barcode()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setBarcode(Z)V

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->card_signup_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setCardSignupUrl(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->credit_pending_period()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setCreditPendingPeriod(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->device_ocr_enabled()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setDeviceOcrEnabled(Z)V

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->home_sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setHomeSortOrder(I)V

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->hotness()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asDouble(Ljava/lang/Number;)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setHotness(D)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->icon_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setIconUrl(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->large_icon_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setLargeIconUrl(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setLink(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->model_c_retailer_image()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setModelCImageUrl(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setName(Ljava/lang/String;)V

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->nearby()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asBoolean(Ljava/lang/Boolean;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setNearby(Z)V

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->parent_retailer_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setParentRetailerId(I)V

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->primary_category_id()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setPrimaryCategoryId(I)V

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->offer_count()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setOfferCount(I)V

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->pwi_home_banner_image()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setPwiHomeBannerImageUrl(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->receipt_formats()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerMapper$lPHI5Ygz_fDOwxfXp0SirpCO_HY;

    invoke-direct {v3, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerMapper$lPHI5Ygz_fDOwxfXp0SirpCO_HY;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)V

    .line 99
    invoke-static {v1, v2, v3}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setReceiptFormats(Ljava/util/Set;)V

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_terms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setRetailerTerms(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->short_description()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setShortDescription(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_order()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setSortOrder(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setType(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->typed_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setTypedId(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->verification_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setVerificationType(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->button_info()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 112
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->buttonInfoMapper:Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Button_info$Fragments;->buttonInfoFragment()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;->map(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 115
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setButtonInfo(Lcom/ibotta/api/model/retailer/ButtonInfo;)V

    .line 119
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->favorite()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 122
    new-instance v2, Lcom/ibotta/api/model/customer/FavoriteRetailer;

    invoke-direct {v2}, Lcom/ibotta/api/model/customer/FavoriteRetailer;-><init>()V

    .line 123
    invoke-virtual {v0}, Lcom/ibotta/api/model/content/RetailerContent;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setRetailerId(I)V

    const/4 v3, 0x1

    .line 124
    invoke-virtual {v2, v3}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setFavoritedState(Z)V

    .line 125
    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->setSortOrder(I)V

    .line 126
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setFavorite(Lcom/ibotta/api/model/customer/FavoriteRetailer;)V

    .line 129
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->gallery_features()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 131
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 133
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;

    .line 134
    iget-object v4, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->featureMapper:Lcom/ibotta/android/graphql/mapper/FeatureMapper;

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Fragments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Gallery_feature$Fragments;->featureFragment()Lcom/ibotta/android/graphql/fragment/FeatureFragment;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/ibotta/android/graphql/mapper/FeatureMapper;->map(Lcom/ibotta/android/graphql/fragment/FeatureFragment;)Lcom/ibotta/api/model/content/FeatureContent;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/content/RetailerContent;->setGalleryFeatures(Ljava/util/List;)V

    .line 140
    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->redemption_meta()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 142
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->retailerRedemptionMetaMapper:Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;

    .line 143
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Redemption_meta$Fragments;->retailerRedemptionMetaFragment()Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;)Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 146
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setRedemptionMeta(Lcom/ibotta/api/model/retailer/RedemptionMeta;)V

    .line 150
    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->retailer_barcode_configuration()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 152
    iget-object v2, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->retailerBarcodeConfigurationMapper:Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;

    .line 153
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Retailer_barcode_configuration$Fragments;->retailerBarcodeConfigurationFragment()Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    move-result-object v1

    .line 152
    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/RetailerBarcodeConfigurationMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;)Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 156
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setRetailerBarcodeConfiguration(Lcom/ibotta/api/model/retailer/RetailerBarcodeConfiguration;)V

    .line 160
    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment;->sort_results()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 162
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 164
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;

    .line 165
    iget-object v3, p0, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->sortResultMapper:Lcom/ibotta/android/graphql/mapper/SortResultMapper;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result;->fragments()Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;->sortResultFragment()Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;->map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 168
    :cond_7
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/RetailerContent;->setSortResults(Ljava/util/List;)V

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

    .line 24
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

    move-result-object p1

    return-object p1
.end method
