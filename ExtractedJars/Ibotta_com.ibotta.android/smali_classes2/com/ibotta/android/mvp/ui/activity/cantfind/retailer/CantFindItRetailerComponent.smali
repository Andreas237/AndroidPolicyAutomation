.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerComponent;
.super Ljava/lang/Object;
.source "CantFindItRetailerComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerActivity;)V
.end method
