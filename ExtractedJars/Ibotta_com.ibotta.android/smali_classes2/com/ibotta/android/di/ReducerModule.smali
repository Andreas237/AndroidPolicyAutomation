.class public abstract Lcom/ibotta/android/di/ReducerModule;
.super Ljava/lang/Object;
.source "ReducerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static provideBannerReducer()Lcom/ibotta/android/featured/BannerReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 339
    new-instance v0, Lcom/ibotta/android/featured/BannerReducer;

    invoke-direct {v0}, Lcom/ibotta/android/featured/BannerReducer;-><init>()V

    return-object v0
.end method

.method public static provideBuyableGiftCardCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 233
    new-instance v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;-><init>(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V

    return-object v0
.end method

.method public static provideBuyableGiftCardImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 242
    new-instance v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideBuyableGiftCardSummaryReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 247
    new-instance v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;-><init>(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method static provideContentBackgroundReducer(Landroid/content/Context;)Lcom/ibotta/android/content/ContentBackgroundReducer;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 321
    new-instance v0, Lcom/ibotta/android/content/ContentBackgroundReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/ContentBackgroundReducer;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static provideContentCardLayoutReducer()Lcom/ibotta/android/content/ContentCardLayoutReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 70
    new-instance v0, Lcom/ibotta/android/content/ContentCardLayoutReducer;

    invoke-direct {v0}, Lcom/ibotta/android/content/ContentCardLayoutReducer;-><init>()V

    return-object v0
.end method

.method static provideContentCardReducer(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;Lcom/ibotta/android/content/card/deal/DealCardReducer;Lcom/ibotta/android/content/card/offer/OfferCardReducer;)Lcom/ibotta/android/content/card/ContentCardReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 330
    new-instance v0, Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/content/card/ContentCardReducer;-><init>(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;Lcom/ibotta/android/content/card/deal/DealCardReducer;Lcom/ibotta/android/content/card/offer/OfferCardReducer;)V

    return-object v0
.end method

.method public static provideContentIdReducer()Lcom/ibotta/android/content/generic/ContentIdReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 169
    new-instance v0, Lcom/ibotta/android/content/generic/ContentIdReducer;

    invoke-direct {v0}, Lcom/ibotta/android/content/generic/ContentIdReducer;-><init>()V

    return-object v0
.end method

.method public static provideContentImageReducer()Lcom/ibotta/android/content/ContentImageReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 164
    new-instance v0, Lcom/ibotta/android/content/ContentImageReducer;

    invoke-direct {v0}, Lcom/ibotta/android/content/ContentImageReducer;-><init>()V

    return-object v0
.end method

.method static provideContentListReducerUtil(Lcom/ibotta/android/content/row/ContentRowReducer;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/tracking/ContentTrackingReducer;)Lcom/ibotta/android/content/ContentListReducerUtil;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 347
    new-instance v0, Lcom/ibotta/android/content/ContentListReducerUtil;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil;-><init>(Lcom/ibotta/android/content/row/ContentRowReducer;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/tracking/ContentTrackingReducer;)V

    return-object v0
.end method

.method public static provideContentRowReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 14
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 201
    new-instance v13, Lcom/ibotta/android/content/row/ContentRowReducer;

    move-object v0, v13

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/content/row/ContentRowReducer;-><init>(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)V

    return-object v13
.end method

.method public static provideContentTrackingReducer()Lcom/ibotta/android/content/tracking/ContentTrackingReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 218
    new-instance v0, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;

    invoke-direct {v0}, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;-><init>()V

    return-object v0
.end method

.method public static provideContentWithInfoRowReducer(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 360
    new-instance v0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;-><init>(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V

    return-object v0
.end method

.method static provideDealButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/deal/DealButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 294
    new-instance v0, Lcom/ibotta/android/content/card/deal/DealButtonReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/deal/DealButtonReducer;-><init>(Lcom/ibotta/android/button/ShopButtonReducer;)V

    return-object v0
.end method

.method static provideDealCardReducer(Lcom/ibotta/android/content/card/deal/DealImageReducer;Lcom/ibotta/android/content/card/deal/DealSummaryReducer;Lcom/ibotta/android/content/card/deal/DealButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/deal/DealCardReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 315
    new-instance v0, Lcom/ibotta/android/content/card/deal/DealCardReducer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/content/card/deal/DealCardReducer;-><init>(Lcom/ibotta/android/content/card/deal/DealImageReducer;Lcom/ibotta/android/content/card/deal/DealSummaryReducer;Lcom/ibotta/android/content/card/deal/DealButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V

    return-object v0
.end method

.method static provideDealImageReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/deal/DealImageReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 300
    new-instance v0, Lcom/ibotta/android/content/card/deal/DealImageReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/deal/DealImageReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method static provideDealSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/deal/DealSummaryReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 306
    new-instance v0, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/deal/DealSummaryReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method static provideDebugFeatureFlagReducer(Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 288
    new-instance v0, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;-><init>(Lcom/ibotta/android/features/factory/VariantFactory;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method

.method public static provideFavoriteButtonReducer()Lcom/ibotta/android/button/FavoriteButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 125
    new-instance v0, Lcom/ibotta/android/button/FavoriteButtonReducer;

    invoke-direct {v0}, Lcom/ibotta/android/button/FavoriteButtonReducer;-><init>()V

    return-object v0
.end method

.method public static provideListViewStyleReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 75
    new-instance v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    invoke-direct {v0}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;-><init>()V

    return-object v0
.end method

.method public static provideOfferBadgeViewReducer(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 154
    new-instance v0, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;-><init>(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideOfferButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;Lcom/ibotta/android/button/UnlockButtonReducer;Lcom/ibotta/api/helper/offer/OfferHelper;)Lcom/ibotta/android/button/OfferButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 110
    new-instance v0, Lcom/ibotta/android/button/OfferButtonReducer;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/button/OfferButtonReducer;-><init>(Lcom/ibotta/android/button/ShopButtonReducer;Lcom/ibotta/android/button/UnlockButtonReducer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-object v0
.end method

.method public static provideOfferCardReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/content/card/offer/OfferImageReducer;Lcom/ibotta/android/content/ContentCardLayoutReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)Lcom/ibotta/android/content/card/offer/OfferCardReducer;
    .locals 10
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 268
    new-instance v9, Lcom/ibotta/android/content/card/offer/OfferCardReducer;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/content/card/offer/OfferCardReducer;-><init>(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/content/card/offer/OfferImageReducer;Lcom/ibotta/android/content/ContentCardLayoutReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V

    return-object v9
.end method

.method public static provideOfferExpiringBannerReducer(Lcom/ibotta/android/util/AppHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 149
    new-instance v0, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    new-instance v1, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;-><init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/res/Resources;)V

    invoke-direct {v0, v1}, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;-><init>(Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;)V

    return-object v0
.end method

.method public static provideOfferImageReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/offer/OfferImageReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 255
    new-instance v0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/content/card/offer/OfferImageReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideOfferSummaryReducer(Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/OfferSummaryReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 142
    new-instance v0, Lcom/ibotta/android/offer/OfferSummaryReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static providePayAtRetailerButtonReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 281
    new-instance v0, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideProductButtonReducer(Lcom/ibotta/android/button/ShopButtonReducer;)Lcom/ibotta/android/content/card/product/ProductButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 174
    new-instance v0, Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/content/card/product/ProductButtonReducer;-><init>(Lcom/ibotta/android/button/ShopButtonReducer;)V

    return-object v0
.end method

.method public static provideProductImageReducer()Lcom/ibotta/android/content/card/product/ProductImageReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 179
    new-instance v0, Lcom/ibotta/android/content/card/product/ProductImageReducer;

    invoke-direct {v0}, Lcom/ibotta/android/content/card/product/ProductImageReducer;-><init>()V

    return-object v0
.end method

.method public static provideProductSummaryReducer(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 184
    new-instance v0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;-><init>(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)V

    return-object v0
.end method

.method public static provideRetailerCategoriesReducer()Lcom/ibotta/android/categories/RetailerCategoriesReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 353
    new-instance v0, Lcom/ibotta/android/categories/RetailerCategoriesReducer;

    invoke-direct {v0}, Lcom/ibotta/android/categories/RetailerCategoriesReducer;-><init>()V

    return-object v0
.end method

.method public static provideRetailerHorizListReducer(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 137
    new-instance v0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;-><init>(Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V

    return-object v0
.end method

.method public static provideRetailerSSCardReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 130
    new-instance v0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideRetailerStackReducer(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/retailer/RetailerStackReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 224
    new-instance v0, Lcom/ibotta/android/retailer/RetailerStackReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/retailer/RetailerStackReducer;-><init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    return-object v0
.end method

.method public static provideRetailerSummaryReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/retailer/RetailerSummaryReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 159
    new-instance v0, Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideShopButtonReducer()Lcom/ibotta/android/button/ShopButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 115
    new-instance v0, Lcom/ibotta/android/button/ShopButtonReducer;

    invoke-direct {v0}, Lcom/ibotta/android/button/ShopButtonReducer;-><init>()V

    return-object v0
.end method

.method public static provideSuggestedSearchItemCtaButtonReducer()Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 80
    new-instance v0, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    invoke-direct {v0}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;-><init>()V

    return-object v0
.end method

.method public static provideSuggestedSearchItemsReducer(Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 91
    new-instance v7, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;-><init>(Landroid/content/res/Resources;Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)V

    return-object v7
.end method

.method public static provideTitleBarReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/title/TitleBarReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 102
    new-instance v0, Lcom/ibotta/android/title/TitleBarReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/title/TitleBarReducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static provideUnlockButtonReducer()Lcom/ibotta/android/button/UnlockButtonReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 120
    new-instance v0, Lcom/ibotta/android/button/UnlockButtonReducer;

    invoke-direct {v0}, Lcom/ibotta/android/button/UnlockButtonReducer;-><init>()V

    return-object v0
.end method
