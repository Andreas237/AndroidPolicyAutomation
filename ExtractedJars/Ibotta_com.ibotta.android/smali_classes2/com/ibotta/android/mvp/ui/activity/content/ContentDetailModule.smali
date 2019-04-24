.class public Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ContentDetailModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    return-object v0
.end method
