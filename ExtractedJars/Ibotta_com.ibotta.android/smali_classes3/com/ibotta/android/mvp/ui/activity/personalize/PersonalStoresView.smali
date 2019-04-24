.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;
.super Ljava/lang/Object;
.source "PersonalStoresView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract disableNextButton()V
.end method

.method public abstract dismissWelcomeBonusDialog()V
.end method

.method public abstract enableNextButton()V
.end method

.method public abstract getAnimationFilename()Ljava/lang/String;
.end method

.method public abstract getHeaderPrompt(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Ljava/lang/String;
.end method

.method public abstract getWelcomeBonusDialogButtonText()Ljava/lang/String;
.end method

.method public abstract setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;",
            ")V"
        }
    .end annotation
.end method

.method public abstract showFindingRebates()V
.end method

.method public abstract showPersonalStoresApps()V
.end method

.method public abstract showWelcomeBonusDialog(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V
.end method
