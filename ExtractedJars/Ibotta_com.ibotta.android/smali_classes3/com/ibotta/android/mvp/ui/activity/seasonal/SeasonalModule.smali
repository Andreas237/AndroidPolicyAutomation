.class public Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "SeasonalModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
        ">;"
    }
.end annotation


# instance fields
.field private final seasonalView:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;->seasonalView:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    return-void
.end method

.method public static synthetic lambda$provideSeasonalDetailEventContextProvider$0(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    .line 49
    invoke-interface {p1, p2}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 50
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;->seasonalView:Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;->getRetailerCategoryId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;
    .locals 7
    .param p4    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "SeasonalDetailEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    return-object v6
.end method

.method public provideSeasonalDetailEventContextProvider(Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .param p1    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "SeasonalEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "SeasonalDetailEventContextProvider"
    .end annotation

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalModule$K83XkgvCFrXEGt7FyRZQs67rUXs;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/seasonal/-$$Lambda$SeasonalModule$K83XkgvCFrXEGt7FyRZQs67rUXs;-><init>(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object v0
.end method
