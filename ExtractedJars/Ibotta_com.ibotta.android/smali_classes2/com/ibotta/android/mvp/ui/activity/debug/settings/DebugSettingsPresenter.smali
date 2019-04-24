.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;
.super Ljava/lang/Object;
.source "DebugSettingsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onColumnsItemSelected(I)V
.end method

.method public abstract onHostNameTextChanged(Ljava/lang/String;)V
.end method

.method public abstract onIgnoreUpdatesChecked(Z)V
.end method

.method public abstract onTMonitorChecked(Z)V
.end method

.method public abstract onUseDebugApiChecked(ZLjava/lang/String;)V
.end method
