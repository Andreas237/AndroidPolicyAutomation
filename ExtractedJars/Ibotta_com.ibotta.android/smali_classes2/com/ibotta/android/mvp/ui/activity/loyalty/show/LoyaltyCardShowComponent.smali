.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowComponent;
.super Ljava/lang/Object;
.source "LoyaltyCardShowComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V
.end method
