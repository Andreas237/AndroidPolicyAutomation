.class public Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;
.super Ljava/lang/Object;
.source "ShowAlsoViewedVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;


# static fields
.field private static final ALSO_BOUGHT_VIEWED_LIMIT:I = 0x4


# instance fields
.field protected graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;)V

    return-void
.end method


# virtual methods
.method public cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
    .locals 1

    const/4 v0, 0x1

    .line 71
    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->signal(Z)V

    return-void
.end method

.method public createOptionalWaitingApiJob()Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v0}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createAlsoViewedCall()Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;

    move-result-object v0

    const/4 v1, 0x4

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->setLimit(Ljava/lang/Integer;)V

    .line 33
    new-instance v1, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-direct {v1, v0}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object v1
.end method

.method public executeOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
    .locals 1

    const/4 v0, 0x0

    .line 66
    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->signal(Z)V

    return-void
.end method

.method public getType()Lcom/ibotta/android/content/spotlight/VariantType;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/content/spotlight/VariantType;->VIEWED:Lcom/ibotta/android/content/spotlight/VariantType;

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

    if-nez p2, :cond_0

    .line 43
    invoke-virtual {p0, p1}, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;->cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V

    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;->setOfferIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V

    if-eqz p3, :cond_1

    .line 48
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;->setRetailerIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V

    .line 50
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/features/variant/alsoboughtviewed/ShowAlsoViewedVariant;->executeOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V

    :goto_0
    return-void
.end method

.method public setOfferIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
    .locals 0

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->setOfferId(Ljava/lang/Integer;)V

    return-void
.end method

.method public setRetailerIdOnApiCall(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Ljava/lang/Integer;)V
    .locals 0

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/offer/alsoviewed/AlsoViewedGraphQlCall;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method
