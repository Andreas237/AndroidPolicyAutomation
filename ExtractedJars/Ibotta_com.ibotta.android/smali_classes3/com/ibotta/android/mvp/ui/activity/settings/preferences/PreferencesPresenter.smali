.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;
.super Ljava/lang/Object;
.source "PreferencesPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onPreferenceClicked(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V
.end method

.method public abstract onSaveClicked()V
.end method

.method public abstract savePreferences(Ljava/lang/String;)V
.end method
