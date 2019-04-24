.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;
.super Ljava/lang/Object;
.source "EngagementPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getLastEngagementSegmentIdSeen()Ljava/lang/Long;
.end method

.method public abstract getLastRewardIdSeen()Ljava/lang/Long;
.end method

.method public abstract getOfferId()Ljava/lang/Integer;
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
.end method

.method public abstract onCurrentEngagementSuccess(Ljava/lang/String;)V
.end method

.method public abstract onRetailerPicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onRetailerPickerDialogDismissClicked()V
.end method

.method public abstract onRetailerPickerDialogDismissed()V
.end method

.method public abstract onShareRequested(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract setOfferId(I)V
.end method

.method public abstract setPermissionsNeeded(Z)V
.end method

.method public abstract setRetailerId(Ljava/lang/Integer;)V
.end method
