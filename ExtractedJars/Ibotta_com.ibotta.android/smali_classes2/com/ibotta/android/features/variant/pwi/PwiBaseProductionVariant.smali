.class public Lcom/ibotta/android/features/variant/pwi/PwiBaseProductionVariant;
.super Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;
.source "PwiBaseProductionVariant.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;-><init>()V

    .line 13
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f1104da

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/ApiContext;->setPwiApiUrl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 0

    .line 23
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerSku()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getGooglePayEnvironmentType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object v0
.end method

.method public isProduction()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
