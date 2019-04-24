.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersComponent;
.super Ljava/lang/Object;
.source "RedeemRetailersComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;,
        Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersActivity;)V
.end method
