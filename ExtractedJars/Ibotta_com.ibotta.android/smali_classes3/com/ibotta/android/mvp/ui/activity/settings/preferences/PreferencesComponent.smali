.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;
.super Ljava/lang/Object;
.source "PreferencesComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;)V
.end method
