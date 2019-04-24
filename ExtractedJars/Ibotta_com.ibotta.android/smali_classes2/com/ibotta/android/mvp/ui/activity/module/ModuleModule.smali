.class public Lcom/ibotta/android/mvp/ui/activity/module/ModuleModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ModuleModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V

    return-object v9
.end method
