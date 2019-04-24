.class public Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "WindfallReceiptCaptureModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideApp()Lcom/ibotta/android/App;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 53
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 39
    new-instance v10, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)V

    return-object v10
.end method

.method public provideReceiptCaptureStorage()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 58
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;-><init>()V

    return-object v0
.end method

.method public provideWindfallReceiptImageSaver()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 63
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaverImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaverImpl;-><init>()V

    return-object v0
.end method
