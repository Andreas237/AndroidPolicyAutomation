.class public Lcom/shopkick/app/store/StoresCarouselPromoController;
.super Lcom/shopkick/app/store/CarouselPromoController;
.source "StoresCarouselPromoController.java"


# instance fields
.field private kickstarterBonusPromoConfigurator:Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/store/PromoTileTimerController;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 16

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    move-object/from16 v11, p8

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    .line 44
    invoke-direct/range {v0 .. v15}, Lcom/shopkick/app/store/CarouselPromoController;-><init>(Landroid/content/Context;Lcom/shopkick/app/controllers/RecyclerViewImageController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/screens/AppScreen;)V

    .line 60
    new-instance v0, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventCoordinator;Lcom/shopkick/app/store/PromoTileTimerController;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/shopkick/app/store/StoresCarouselPromoController;->kickstarterBonusPromoConfigurator:Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;

    .line 64
    iget-object v0, v1, Lcom/shopkick/app/store/StoresCarouselPromoController;->supportedPromoConfigurators:Ljava/util/Set;

    iget-object v2, v1, Lcom/shopkick/app/store/StoresCarouselPromoController;->kickstarterBonusPromoConfigurator:Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;
    .locals 1

    const/16 v0, 0x70

    if-ne p1, v0, :cond_0

    .line 70
    iget-object p1, p0, Lcom/shopkick/app/store/StoresCarouselPromoController;->kickstarterBonusPromoConfigurator:Lcom/shopkick/app/store/KickstarterBonusPromoConfigurator;

    return-object p1

    .line 72
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object p1

    return-object p1
.end method
