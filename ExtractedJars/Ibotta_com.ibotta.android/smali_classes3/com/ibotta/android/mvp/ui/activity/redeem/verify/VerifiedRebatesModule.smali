.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifiedRebatesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static providVerifiedRebatesReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 39
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/redeem/verify/VerifiedRebatesReducer;)V

    return-object v7
.end method
