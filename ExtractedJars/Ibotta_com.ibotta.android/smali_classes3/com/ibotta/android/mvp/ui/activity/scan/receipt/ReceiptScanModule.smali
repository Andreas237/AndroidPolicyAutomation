.class public Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ReceiptScanModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanView;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method

.method public static provideReceiptScanReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;-><init>(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;)V

    return-object v0
.end method
