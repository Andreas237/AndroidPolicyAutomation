.class public Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ReceiptViewerModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 24
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V

    return-object v0
.end method
