.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;
.super Ljava/lang/Object;
.source "WalletV2Component.java"

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
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)V
.end method
