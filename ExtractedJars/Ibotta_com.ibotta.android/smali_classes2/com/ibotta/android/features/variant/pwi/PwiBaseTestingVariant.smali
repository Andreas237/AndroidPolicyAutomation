.class public Lcom/ibotta/android/features/variant/pwi/PwiBaseTestingVariant;
.super Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;
.source "PwiBaseTestingVariant.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;-><init>()V

    .line 12
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f110364

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/ApiContext;->setPwiApiUrl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 0

    const-string p1, "VUSD-D-V-01"

    return-object p1
.end method

.method public getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object v0
.end method

.method public isProduction()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
