.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;
.super Ljava/lang/Object;
.source "RecentlyViewedOfferHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;


# static fields
.field private static final MODULE_INDEX:I = 0x2


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method

.method private getMatchingRetailerId(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/RetailerModel;
    .locals 2

    if-eqz p2, :cond_0

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 92
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    return-object p2
.end method

.method private isSpotlight(II)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$getRecentlyViewedOffers$0(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;ILcom/ibotta/api/model/OfferModel;)Z
    .locals 0

    .line 60
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->isSpotlight(II)Z

    move-result p1

    return p1
.end method

.method public static synthetic lambda$getRecentlyViewedOffers$1(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/content/OfferDisplayContent;
    .locals 2

    .line 61
    new-instance v0, Lcom/ibotta/android/content/OfferDisplayContent;

    .line 63
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->getMatchingRetailerId(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->SIDE_SCROLLER:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v0, p2, p1, v1}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method


# virtual methods
.method public cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
    .locals 1

    const/4 v0, 0x1

    .line 126
    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->signal(Z)V

    return-void
.end method

.method public createViewedOfferJob(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
    .locals 0

    .line 104
    invoke-interface {p1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createViewedOfferCall()Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;

    move-result-object p1

    .line 105
    invoke-interface {p2}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 106
    new-instance p2, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-direct {p2, p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    return-object p2
.end method

.method public getRecentlyViewedOffers(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/content/ContentListReducerUtil;ILcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p4    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            "I",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;

    if-eqz v1, :cond_1

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$8Kkhp9wcLQDNTRQ9H1NPivhSHzo;

    invoke-direct {v2, p0, p3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$8Kkhp9wcLQDNTRQ9H1NPivhSHzo;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;I)V

    .line 60
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->dropWhile(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p3

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;

    invoke-direct {v1, p0, p4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;Lcom/ibotta/api/model/RetailerModel;)V

    .line 61
    invoke-interface {p3, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p3

    .line 65
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    if-eqz p4, :cond_0

    .line 67
    invoke-interface {p4}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 69
    :goto_0
    invoke-static {p5}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p5

    .line 70
    invoke-virtual {p5, p7}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p5

    const/4 p7, 0x2

    .line 71
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    invoke-virtual {p5, p7}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p5

    .line 72
    invoke-virtual {p5, p4}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p4

    .line 73
    invoke-virtual {p4}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p4

    .line 75
    invoke-virtual {p2, p3, p4}, Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p2

    .line 77
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;->getOffers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferResponse;->getOffers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p6, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->updateRecentlyViewedModuleOffers(Ljava/util/List;)V

    .line 87
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;)V
    .locals 2
    .param p2    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;

    if-eqz p2, :cond_0

    .line 115
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->setOfferId(I)V

    .line 116
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getOfferGroupId()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/graphql/offer/viewedoffer/ViewedOfferGraphQLCall;->setOfferGroupId(Ljava/lang/Integer;)V

    const/4 p2, 0x0

    .line 118
    invoke-virtual {p1, p2}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->signal(Z)V

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V

    :goto_0
    return-void
.end method
