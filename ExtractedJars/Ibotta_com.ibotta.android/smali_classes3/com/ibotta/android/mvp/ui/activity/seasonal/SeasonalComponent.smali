.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalComponent;
.super Ljava/lang/Object;
.source "SeasonalComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalView;",
        "Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;)V
.end method
