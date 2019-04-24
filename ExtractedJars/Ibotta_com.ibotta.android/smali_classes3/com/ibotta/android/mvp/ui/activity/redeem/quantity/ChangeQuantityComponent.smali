.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;
.super Ljava/lang/Object;
.source "ChangeQuantityComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V
.end method
