.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsComponent;
.super Ljava/lang/Object;
.source "RedeemReqsComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V
.end method
