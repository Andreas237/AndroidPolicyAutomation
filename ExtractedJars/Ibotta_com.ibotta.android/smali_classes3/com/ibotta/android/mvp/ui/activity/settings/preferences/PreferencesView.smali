.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;
.super Ljava/lang/Object;
.source "PreferencesView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract displayPasswordPrompt(Ljava/lang/String;)V
.end method

.method public abstract getLightText()Ljava/lang/String;
.end method

.method public abstract getSoundText()Ljava/lang/String;
.end method

.method public abstract getVibrateText()Ljava/lang/String;
.end method

.method public abstract onSaveSuccess()V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;",
            ">;)V"
        }
    .end annotation
.end method
