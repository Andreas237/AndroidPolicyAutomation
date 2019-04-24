.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;
.super Ljava/lang/Object;
.source "LinkedOfferComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V
.end method
