.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;
.super Ljava/lang/Object;
.source "PwiRoutingComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;)V
.end method
