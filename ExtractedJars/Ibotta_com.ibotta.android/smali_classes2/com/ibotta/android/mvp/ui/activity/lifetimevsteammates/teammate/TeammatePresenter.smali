.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammatePresenter;
.super Ljava/lang/Object;
.source "TeammatePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getFlyUpPageCreator(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
.end method

.method public abstract onFriendMessageFailed(Lcom/ibotta/api/ApiErrorDetails;)V
.end method

.method public abstract onMessageClicked()V
.end method

.method public abstract onNudgeClicked()V
.end method

.method public abstract setActivityParcelable(Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)V
.end method

.method public abstract setFriendId(I)V
.end method

.method public abstract setGraphDataParams(Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/GraphDataParams;)V
.end method
