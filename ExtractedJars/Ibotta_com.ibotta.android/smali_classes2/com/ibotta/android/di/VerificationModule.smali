.class public abstract Lcom/ibotta/android/di/VerificationModule;
.super Ljava/lang/Object;
.source "VerificationModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideOfferQuantityDatabase(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/verification/OfferQuantityDatabase;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 44
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-string v2, "offer_quantity_database"

    .line 45
    invoke-virtual {p1, v2, v1}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 48
    new-instance v1, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/SharedPreferences;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/json/IbottaJson;)V

    return-object v1
.end method

.method public static provideReceiptSubmissionHelper(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/UuidGenerator;)Lcom/ibotta/android/submission/ReceiptSubmissionHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 54
    new-instance v0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/UuidGenerator;)V

    return-object v0
.end method

.method public static provideUuidGenerator()Lcom/ibotta/android/util/UuidGenerator;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 59
    new-instance v0, Lcom/ibotta/android/util/UuidGenerator;

    invoke-direct {v0}, Lcom/ibotta/android/util/UuidGenerator;-><init>()V

    return-object v0
.end method

.method public static provideVerificationManager(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/verification/VerificationManager;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 37
    new-instance v0, Lcom/ibotta/android/verification/VerificationManagerImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/verification/VerificationManagerImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)V

    return-object v0
.end method
