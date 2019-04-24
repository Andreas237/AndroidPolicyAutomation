.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PwiBarcodeModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 31
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)V

    return-object v8
.end method
