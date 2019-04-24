.class public abstract Lcom/ibotta/android/di/WindfallModule;
.super Ljava/lang/Object;
.source "WindfallModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static provideWindfallGatekeeper(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;-><init>(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)V

    return-object v0
.end method

.method static provideWindfallHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;)Lcom/ibotta/android/windfall/helper/WindfallHelper;
    .locals 12
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 68
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    sget-object v1, Lcom/ibotta/android/json/NamingPolicy;->AS_IS:Lcom/ibotta/android/json/NamingPolicy;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(Lcom/ibotta/android/json/NamingPolicy;ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v11

    .line 71
    new-instance v0, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v4 .. v11}, Lcom/ibotta/android/windfall/helper/WindfallHelperImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/ApiContext;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/json/IbottaJson;)V

    return-object v0
.end method

.method static provideWindfallReceiptSdk(Landroid/content/Context;Lcom/ibotta/android/profile/BuildProfile;)Lcom/ibotta/android/windfall/WindfallReceiptSdk;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 56
    new-instance v0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;

    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->WINDFALL_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v1, v2}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/profile/BuildProfile;Ljava/lang/String;)V

    return-object v0
.end method

.method static provideWindfallRetailerSupport()Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupportImpl;

    invoke-direct {v0}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupportImpl;-><init>()V

    return-object v0
.end method
