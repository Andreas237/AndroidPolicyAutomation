.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "MyOffersGalleryModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
        ">;"
    }
.end annotation


# instance fields
.field private final vc:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;
    .locals 16
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 52
    new-instance v15, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;

    move-object/from16 v14, p0

    iget-object v4, v14, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v15

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v15
.end method
