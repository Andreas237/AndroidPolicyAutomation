.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailComponent;
.super Ljava/lang/Object;
.source "EarningsDetailComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;)V
.end method
