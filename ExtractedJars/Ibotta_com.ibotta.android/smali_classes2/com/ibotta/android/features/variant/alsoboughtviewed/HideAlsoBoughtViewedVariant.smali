.class public Lcom/ibotta/android/features/variant/alsoboughtviewed/HideAlsoBoughtViewedVariant;
.super Ljava/lang/Object;
.source "HideAlsoBoughtViewedVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
    .locals 0

    return-void
.end method

.method public createOptionalWaitingApiJob()Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public executeOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
    .locals 0

    return-void
.end method

.method public getType()Lcom/ibotta/android/content/spotlight/VariantType;
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/content/spotlight/VariantType;->NOOP:Lcom/ibotta/android/content/spotlight/VariantType;

    return-object v0
.end method

.method public onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V
    .locals 0
    .param p2    # Lcom/ibotta/api/model/OfferModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public setOfferIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
    .locals 0

    return-void
.end method

.method public setRetailerIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
    .locals 0

    return-void
.end method
