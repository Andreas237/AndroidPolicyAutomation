.class public Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;
.super Ljava/lang/Object;
.source "ExpiringBannerVariantsConfig.java"


# instance fields
.field private variant1:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_1"
    .end annotation
.end field

.field private variant2:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_2"
    .end annotation
.end field

.field private variant3:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_3"
    .end annotation
.end field

.field private variant4:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_4"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getVariant1()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant1:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-object v0
.end method

.method public getVariant2()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant2:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-object v0
.end method

.method public getVariant3()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant3:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-object v0
.end method

.method public getVariant4()Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant4:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-object v0
.end method

.method public setVariant1(Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant1:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-void
.end method

.method public setVariant2(Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant2:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-void
.end method

.method public setVariant3(Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant3:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-void
.end method

.method public setVariant4(Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariantsConfig;->variant4:Lcom/ibotta/android/state/app/config/expiringbanner/ExpiringBannerVariant;

    return-void
.end method
