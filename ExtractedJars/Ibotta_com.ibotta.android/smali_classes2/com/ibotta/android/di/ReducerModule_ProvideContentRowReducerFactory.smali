.class public final Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideContentRowReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/content/row/ContentRowReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentIdReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/generic/ContentIdReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final contentImageReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentImageReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final favoriteButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/FavoriteButtonReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final offerBadgeViewReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final offerButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final offerExpiringBannerReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final offerSummaryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/OfferSummaryReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final productButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductButtonReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final productImageReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductImageReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final productSummaryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerStackReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerStackReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerSummaryReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/OfferSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/generic/ContentIdReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/FavoriteButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerStackReducer;",
            ">;)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerButtonReducerProvider:Ljavax/inject/Provider;

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerSummaryReducerProvider:Ljavax/inject/Provider;

    .line 66
    iput-object p3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerBadgeViewReducerProvider:Ljavax/inject/Provider;

    .line 67
    iput-object p4, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerExpiringBannerReducerProvider:Ljavax/inject/Provider;

    .line 68
    iput-object p5, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->contentIdReducerProvider:Ljavax/inject/Provider;

    .line 69
    iput-object p6, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->contentImageReducerProvider:Ljavax/inject/Provider;

    .line 70
    iput-object p7, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->favoriteButtonReducerProvider:Ljavax/inject/Provider;

    .line 71
    iput-object p8, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->retailerSummaryReducerProvider:Ljavax/inject/Provider;

    .line 72
    iput-object p9, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productImageReducerProvider:Ljavax/inject/Provider;

    .line 73
    iput-object p10, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productSummaryReducerProvider:Ljavax/inject/Provider;

    .line 74
    iput-object p11, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productButtonReducerProvider:Ljavax/inject/Provider;

    .line 75
    iput-object p12, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->retailerStackReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/OfferSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/generic/ContentIdReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/FavoriteButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerStackReducer;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;"
        }
    .end annotation

    .line 136
    new-instance v13, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;

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

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v13
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/OfferButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/OfferSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/generic/ContentIdReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/button/FavoriteButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductImageReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/card/product/ProductButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/retailer/RetailerStackReducer;",
            ">;)",
            "Lcom/ibotta/android/content/row/ContentRowReducer;"
        }
    .end annotation

    .line 109
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/button/OfferButtonReducer;

    .line 110
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/offer/OfferSummaryReducer;

    .line 111
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    .line 112
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    .line 113
    invoke-interface/range {p4 .. p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/content/generic/ContentIdReducer;

    .line 114
    invoke-interface/range {p5 .. p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/content/ContentImageReducer;

    .line 115
    invoke-interface/range {p6 .. p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/button/FavoriteButtonReducer;

    .line 116
    invoke-interface/range {p7 .. p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/retailer/RetailerSummaryReducer;

    .line 117
    invoke-interface/range {p8 .. p8}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ibotta/android/content/card/product/ProductImageReducer;

    .line 118
    invoke-interface/range {p9 .. p9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;

    .line 119
    invoke-interface/range {p10 .. p10}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/content/card/product/ProductButtonReducer;

    .line 120
    invoke-interface/range {p11 .. p11}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-object p0, v0

    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    .line 108
    invoke-static/range {p0 .. p11}, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->proxyProvideContentRowReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideContentRowReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 0

    .line 165
    invoke-static/range {p0 .. p11}, Lcom/ibotta/android/di/ReducerModule;->provideContentRowReducer(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/content/generic/ContentIdReducer;Lcom/ibotta/android/content/ContentImageReducer;Lcom/ibotta/android/button/FavoriteButtonReducer;Lcom/ibotta/android/retailer/RetailerSummaryReducer;Lcom/ibotta/android/content/card/product/ProductImageReducer;Lcom/ibotta/android/content/card/product/ProductSummaryReducer;Lcom/ibotta/android/content/card/product/ProductButtonReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;)Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 164
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/row/ContentRowReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/content/row/ContentRowReducer;
    .locals 12

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerButtonReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerSummaryReducerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerBadgeViewReducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->offerExpiringBannerReducerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->contentIdReducerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->contentImageReducerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->favoriteButtonReducerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->retailerSummaryReducerProvider:Ljavax/inject/Provider;

    iget-object v8, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productImageReducerProvider:Ljavax/inject/Provider;

    iget-object v9, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productSummaryReducerProvider:Ljavax/inject/Provider;

    iget-object v10, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->productButtonReducerProvider:Ljavax/inject/Provider;

    iget-object v11, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->retailerStackReducerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v11}, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideContentRowReducerFactory;->get()Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    return-object v0
.end method
