.class public Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;
.super Lcom/microblink/SimpleRecognizerCallback;
.source "WindfallRecognizerCallbackImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;


# instance fields
.field private redeemReqsPresenter:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/microblink/SimpleRecognizerCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public attach(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;->redeemReqsPresenter:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;->redeemReqsPresenter:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    return-void
.end method

.method public onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lcom/microblink/SimpleRecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    .line 22
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;->redeemReqsPresenter:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    if-eqz p2, :cond_0

    .line 23
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onWalmartQrCodeProcessedSuccessfully(Lcom/microblink/ScanResults;)V

    :cond_0
    return-void
.end method

.method public onRecognizerException(Ljava/lang/Throwable;)V
    .locals 1

    .line 29
    invoke-super {p0, p1}, Lcom/microblink/SimpleRecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallbackImpl;->redeemReqsPresenter:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;

    if-eqz v0, :cond_0

    .line 31
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;->onWalmartQrCodeProcessedFailed(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
