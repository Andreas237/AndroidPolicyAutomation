.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;
.super Ljava/lang/Object;
.source "VerifyWizardPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onBackPressed()V
.end method

.method public abstract onNoClicked()V
.end method

.method public abstract onScanFailed()V
.end method

.method public abstract onScanSuccess()V
.end method

.method public abstract onYesClicked()V
.end method

.method public abstract setData(ILcom/ibotta/android/fragment/retailer/RetailerParcel;ILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;)V"
        }
    .end annotation
.end method
