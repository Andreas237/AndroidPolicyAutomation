.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DebugRoutesModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideDebugRoutes()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;-><init>()V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;
    .locals 8
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 32
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V

    return-object v7
.end method
