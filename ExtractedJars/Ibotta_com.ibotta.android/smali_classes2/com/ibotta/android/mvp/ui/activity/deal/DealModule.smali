.class public Lcom/ibotta/android/mvp/ui/activity/deal/DealModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DealModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;
    .locals 7
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 28
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    return-object v6
.end method
