.class public Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "LinkedOfferModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
