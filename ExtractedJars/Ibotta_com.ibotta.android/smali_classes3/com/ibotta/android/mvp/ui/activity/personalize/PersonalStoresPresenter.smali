.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;
.super Ljava/lang/Object;
.source "PersonalStoresPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract dialogActionClicked()V
.end method

.method public abstract getPersonalStoreMode()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
.end method

.method public abstract onBackPressed()V
.end method

.method public abstract onNextClicked()V
.end method

.method public abstract onPersonalRetailerCardClicked(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
.end method

.method public abstract setNextButtonEnabled(Z)V
.end method

.method public abstract setPersonalStoreMode(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
.end method
