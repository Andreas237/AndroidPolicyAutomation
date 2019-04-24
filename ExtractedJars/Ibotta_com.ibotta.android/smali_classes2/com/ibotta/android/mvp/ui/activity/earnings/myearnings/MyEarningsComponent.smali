.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsComponent;
.super Ljava/lang/Object;
.source "MyEarningsComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsView;",
        "Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/earnings/myearnings/MyEarningsActivity;)V
.end method
