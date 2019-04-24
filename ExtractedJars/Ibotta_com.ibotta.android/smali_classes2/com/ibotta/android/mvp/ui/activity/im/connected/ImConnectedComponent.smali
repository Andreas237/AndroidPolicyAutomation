.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedComponent;
.super Ljava/lang/Object;
.source "ImConnectedComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedActivity;)V
.end method
