.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;
.super Ljava/lang/Object;
.source "RecentlyViewedOfferHelper.java"


# virtual methods
.method public abstract cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V
.end method

.method public abstract createViewedOfferJob(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;
.end method

.method public abstract getRecentlyViewedOffers(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/content/ContentListReducerUtil;ILcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Ljava/lang/String;)Ljava/util/List;
    .param p4    # Lcom/ibotta/api/model/RetailerModel;
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
.end method

.method public abstract onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;)V
    .param p2    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
