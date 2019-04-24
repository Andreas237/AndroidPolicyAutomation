.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "WalletV2Module.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public providePwiWalletReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiWalletV2Reducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;

    invoke-direct {v0, p1}, Lcom/ibotta/android/pwi/PwiWalletV2Reducer;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public provideWalletV2MvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/pwi/PwiWalletV2Reducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;
    .locals 10
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 34
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiHomeReducer;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/pwi/PwiWalletV2Reducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;)V

    return-object v9
.end method
