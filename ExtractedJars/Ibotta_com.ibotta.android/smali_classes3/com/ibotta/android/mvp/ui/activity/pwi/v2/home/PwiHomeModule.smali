.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PwiHomeModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;
    .locals 14
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 42
    new-instance v13, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;

    move-object v0, v13

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    return-object v13
.end method

.method public providePwiErrorDialogFactory(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method
