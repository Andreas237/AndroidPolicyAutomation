.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersComponent;
.super Ljava/lang/Object;
.source "MyOffersComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;)V
.end method
