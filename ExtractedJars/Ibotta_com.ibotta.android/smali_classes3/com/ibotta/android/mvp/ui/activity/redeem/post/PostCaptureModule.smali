.class public Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "PostCaptureModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    return-object v0
.end method
