.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;
.super Ljava/lang/Object;
.source "DebugRoutesComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
.end method
