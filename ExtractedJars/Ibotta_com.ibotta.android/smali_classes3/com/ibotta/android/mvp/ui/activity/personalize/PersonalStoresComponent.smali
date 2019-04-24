.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;
.super Ljava/lang/Object;
.source "PersonalStoresComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;)V
.end method
