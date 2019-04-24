.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;
.super Ljava/lang/Object;
.source "PwiCardInputPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V
.end method

.method public abstract isFirstTimeCard()Z
.end method

.method public abstract setFirstTimeCard(Z)V
.end method
