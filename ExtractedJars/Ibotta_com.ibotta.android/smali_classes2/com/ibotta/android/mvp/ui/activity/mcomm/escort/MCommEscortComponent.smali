.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortComponent;
.super Ljava/lang/Object;
.source "MCommEscortComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortView;",
        "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
.end method
