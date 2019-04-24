.class public Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "VerifyScanModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideBarcodeMatcher()Lcom/ibotta/android/verification/BarcodeMatcher;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/verification/BarcodeMatcher;

    invoke-direct {v0}, Lcom/ibotta/android/verification/BarcodeMatcher;-><init>()V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/ProductGroupHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/verification/BarcodeMatcher;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 40
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/ProductGroupHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/verification/BarcodeMatcher;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v8
.end method
