.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;
.super Ljava/lang/Object;
.source "PwiCardInputView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract finishWithSuccessResult()V
.end method

.method public abstract showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
.end method

.method public abstract showGenericStripeErrorMessage(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
