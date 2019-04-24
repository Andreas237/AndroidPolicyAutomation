.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;
.super Ljava/lang/Object;
.source "DebugSettingsComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpComponent;


# annotations
.annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
.end annotation

.annotation runtime Ldagger/Component;
    dependencies = {
        Lcom/ibotta/android/di/MainComponent;
    }
    modules = {
        Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V
.end method
